package com.task.taskmanagement.dto.request;

import com.task.taskmanagement.entity.TaskPriority;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddTaskRequestDto {
    private String title;
    private String description;
    private TaskPriority taskPriority;
    private String taskWeight;
}