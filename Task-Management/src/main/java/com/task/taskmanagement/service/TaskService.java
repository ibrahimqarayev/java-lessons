package com.task.taskmanagement.service;

import com.task.taskmanagement.converter.TaskConverter;
import com.task.taskmanagement.dto.request.AddTaskRequestDto;
import com.task.taskmanagement.dto.request.UpdateTaskRequestDto;
import com.task.taskmanagement.dto.response.AllTasksResponseDto;
import com.task.taskmanagement.dto.response.PageResponseDto;
import com.task.taskmanagement.dto.response.TaskResponseDto;
import com.task.taskmanagement.entity.TaskEntity;
import com.task.taskmanagement.entity.TaskPriority;
import com.task.taskmanagement.entity.TaskStatus;
import com.task.taskmanagement.exception.InvalidTaskModificationException;
import com.task.taskmanagement.exception.TaskAlreadyDeletedException;
import com.task.taskmanagement.exception.TaskAlreadyExistsException;
import com.task.taskmanagement.exception.TaskNotFoundException;
import com.task.taskmanagement.repository.TaskRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class TaskService {

    private final TaskRepository taskRepository;
    private final TaskConverter taskConverter;

    public TaskService(TaskRepository taskRepository, TaskConverter taskConverter) {
        this.taskRepository = taskRepository;
        this.taskConverter = taskConverter;
    }

    public PageResponseDto<AllTasksResponseDto> getAll(
            int pageNumber,
            int pageSize,
            TaskStatus taskStatus,
            TaskPriority taskPriority
    ) {

        Pageable pageable = PageRequest.of(
                pageNumber,
                pageSize,
                Sort.by(Sort.Direction.DESC, "id")
        );

        Page<TaskEntity> page = taskRepository.findAll(pageable);
        List<AllTasksResponseDto> elements = page.getContent()
                .stream()
                .map(taskConverter::toAllTasksResponseDtoFromEntity)
                .toList();

        return new PageResponseDto<>(
                elements,
                page.getNumber(),
                page.getSize(),
                page.getTotalElements(),
                page.getTotalPages(),
                page.hasNext()
        );
    }

    public TaskResponseDto getById(Integer id) {
        TaskEntity taskEntity = taskRepository.findByIdAndStatusTrue(id)
                .orElseThrow(() -> new TaskNotFoundException("Task not found"));
        return taskConverter.toTaskResponseDtoFromEntity(taskEntity);
    }

    public void saveTask(AddTaskRequestDto requestDto) {
        if (taskRepository.existsByTitleIgnoreCase(requestDto.getTitle())) {
            throw new TaskAlreadyExistsException("Task already exists");
        }
        taskRepository.save(taskConverter.toEntityFromAddTaskResponseDto(requestDto));
    }

    public void deleteById(Integer id) {
        TaskEntity entity = getEntityById(id);

        if (entity.getStatus().equals(false)) {
            throw new TaskAlreadyDeletedException("Task already deleted");
        }
        entity.setStatus(false);
        taskRepository.save(entity);
    }


    public void updateTask(Integer id, UpdateTaskRequestDto requestDto) {
        TaskEntity entity = getEntityById(id);

        if (taskRepository.existsByTitleAndIdNot(requestDto.getTitle(), id)) {
            throw new TaskAlreadyExistsException("Task already exists");
        }

        if (entity.getStatus().equals(false) || entity.getTaskStatus().equals(TaskStatus.COMPLETED)) {
            throw new InvalidTaskModificationException("Invalid task modification");
        }

        entity.setTitle(requestDto.getTitle().trim());
        entity.setDescription(requestDto.getDescription().trim());
        entity.setTaskStatus(requestDto.getTaskStatus());
        entity.setTaskPriority(requestDto.getTaskPriority());
        entity.setTaskWeight(requestDto.getTaskWeight());

        taskRepository.save(entity);
    }

    private TaskEntity getEntityById(Integer id) {
        return taskRepository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException("Task not found"));
    }
}
