package com.task.taskmanagement.dto.response;

import com.task.taskmanagement.entity.TaskPriority;
import com.task.taskmanagement.entity.TaskStatus;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class TaskResponseDto {
    private Integer id;
    private String title;
    private String description;
    private TaskStatus taskStatus;
    private TaskPriority taskPriority;
    private String taskWeight;
    private LocalDateTime createdAt;
}
