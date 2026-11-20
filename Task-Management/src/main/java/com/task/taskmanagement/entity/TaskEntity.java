package com.task.taskmanagement.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tasks")
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title", nullable = false, unique = true, length = 40)
    private String title;

    @Column(name = "description", columnDefinition = "TEXT", length = 2000)
    private String description;

    @Column(name = "task_status", nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private TaskStatus taskStatus;

    @Column(name = "task_priority", nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private TaskPriority taskPriority;

    @Column(name = "task_weight")
    private Short taskWeight;

    @Column(name = "status", nullable = false)
    private Boolean status = true;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @PrePersist
    public void onCreate() {
        taskStatus = TaskStatus.TODO;
        createdAt = LocalDateTime.now();
    }
}
