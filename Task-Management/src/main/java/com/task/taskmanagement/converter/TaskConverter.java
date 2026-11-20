package com.task.taskmanagement.converter;

import com.task.taskmanagement.dto.request.AddTaskRequestDto;
import com.task.taskmanagement.dto.response.AllTasksResponseDto;
import com.task.taskmanagement.dto.response.TaskResponseDto;
import com.task.taskmanagement.entity.TaskEntity;
import com.task.taskmanagement.entity.TaskStatus;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TaskConverter {

    public TaskResponseDto toTaskResponseDtoFromEntity(TaskEntity task) {
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

    public TaskEntity toEntityFromAddTaskResponseDto(AddTaskRequestDto addTaskRequestDto) {
        TaskEntity taskEntity = new TaskEntity();

        taskEntity.setTitle(addTaskRequestDto.getTitle());
        taskEntity.setDescription(addTaskRequestDto.getDescription());
        taskEntity.setTaskStatus(TaskStatus.TODO);
        taskEntity.setTaskPriority(addTaskRequestDto.getTaskPriority());
        taskEntity.setTaskWeight(addTaskRequestDto.getTaskWeight());
        taskEntity.setStatus(true);
        taskEntity.setCreatedAt(LocalDateTime.now());
        return taskEntity;
    }

    public AllTasksResponseDto toAllTasksResponseDtoFromEntity(TaskEntity taskEntity) {
        return new AllTasksResponseDto(
                taskEntity.getId(),
                taskEntity.getTitle(),
                taskEntity.getTaskStatus()
        );
    }
}
