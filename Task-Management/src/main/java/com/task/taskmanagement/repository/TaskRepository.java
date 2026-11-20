package com.task.taskmanagement.repository;

import com.task.taskmanagement.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Integer> {

    Optional<TaskEntity> findByIdAndStatusTrue(Integer id);

    boolean existsByTitleIgnoreCase(String title);

    boolean existsByTitleAndIdNot(String title, Integer id);
}
