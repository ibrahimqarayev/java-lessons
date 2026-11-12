package com.task.taskmanagement.dto.request;

import com.task.taskmanagement.entity.TaskPriority;
import com.task.taskmanagement.entity.TaskStatus;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UpdateTaskRequestDto {
    private String title;
    private String description;
    private TaskStatus taskStatus;
    private TaskPriority taskPriority;
    private String taskWeight;
}