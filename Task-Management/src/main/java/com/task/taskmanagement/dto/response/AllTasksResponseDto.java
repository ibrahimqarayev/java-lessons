package com.task.taskmanagement.dto.response;

import com.task.taskmanagement.entity.TaskStatus;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
public class AllTasksResponseDto {
    private Integer id;
    private String title;
    private TaskStatus taskStatus;
}
