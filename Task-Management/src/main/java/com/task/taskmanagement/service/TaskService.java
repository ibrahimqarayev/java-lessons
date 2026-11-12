package com.task.taskmanagement.service;

import com.task.taskmanagement.converter.TaskConverter;
import com.task.taskmanagement.dto.request.AddTaskRequestDto;
import com.task.taskmanagement.dto.request.UpdateTaskRequestDto;
import com.task.taskmanagement.dto.response.AllTasksResponseDto;
import com.task.taskmanagement.dto.response.TaskResponseDto;
import com.task.taskmanagement.entity.TaskEntity;
import com.task.taskmanagement.repository.TaskRepository;
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

    public List<AllTasksResponseDto> getAll() {
        return taskRepository.findAll()
                .stream()
                .map(taskConverter::toAllTasksResponseDtoFromEntity).toList();
    }

    public TaskResponseDto getById(Integer id) {
        TaskEntity task = getEntityById(id);
        return taskConverter.toTaskResponseDtoFromEntity(task);
    }

    public void saveTask(AddTaskRequestDto requestDto) {
        taskRepository.save(taskConverter.toEntityFromAddTaskResponseDto(requestDto));
    }

    public void deleteById(Integer id) {
        TaskEntity taskEntity = getEntityById(id);
        taskEntity.setStatus(false);
        taskRepository.save(taskEntity);
    }

    public void updateTask(Integer id, UpdateTaskRequestDto updateTaskRequestDto) {
        TaskEntity taskEntity = getEntityById(id);

        taskEntity.setTitle(updateTaskRequestDto.getTitle());
        taskEntity.setDescription(updateTaskRequestDto.getDescription());
        taskEntity.setTaskStatus(updateTaskRequestDto.getTaskStatus());
        taskEntity.setTaskPriority(updateTaskRequestDto.getTaskPriority());
        taskEntity.setTaskWeight(updateTaskRequestDto.getTaskWeight());
    }

    private TaskEntity getEntityById(Integer id) {
        return taskRepository.findById(id).get();
    }
}
