package com.task.taskmanagement.service;

import com.task.taskmanagement.dto.response.GetAllTaskResponseDto;
import com.task.taskmanagement.dto.response.TaskResponseDto;
import com.task.taskmanagement.entity.TaskEntity;
import com.task.taskmanagement.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<GetAllTaskResponseDto> getAll() {
        return taskRepository.findAll()
                .stream()
                .map(task -> new GetAllTaskResponseDto(
                        task.getId(),
                        task.getTitle(),
                        task.getDescription(),
                        task.getTaskStatus(),
                        task.getCreatedAt()
                )).toList();
    }

    public TaskResponseDto getById(Integer id) {
        TaskEntity task = taskRepository.findById(id).get();
        return new TaskResponseDto(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getTaskStatus(),
                task.getTaskPriority(),
                task.getTaskWeight(),
                task.getCreatedAt()
        );
    }

    public void saveTask(TaskEntity taskEntity) {
        taskRepository.save(taskEntity);
    }

    public void deleteById(Integer id) {
        taskRepository.deleteById(id);
    }
}
