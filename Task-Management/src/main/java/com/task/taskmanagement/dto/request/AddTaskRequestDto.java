package com.task.taskmanagement.dto.request;

import com.task.taskmanagement.entity.TaskPriority;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddTaskRequestDto {
    @NotNull(message = "Title can not be null")
    private String title;

    @NotEmpty(message = "Description can not be empty")
    private String description;

    @NotNull(message = "Priority can not be null")
    private TaskPriority taskPriority;

    @Min(value = 1, message = "Weight must be least 1")
    @Max(value = 10, message = "Weight must be most 10")
    private String taskWeight;
}