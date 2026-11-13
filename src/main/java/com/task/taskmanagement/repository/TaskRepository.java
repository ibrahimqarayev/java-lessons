package com.task.taskmanagement.repository;

import com.task.taskmanagement.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Integer> {

    @Modifying
    @Query("""
            update TaskEntity task set task.taskStatus=false WHERE task.id=?1
            """)
    void updateByTextEntityById(Integer id);

    @Modifying
    @Query(value = "SELECT * FROM tasks", nativeQuery = true)
    void updateByTextEntityByNative(Integer id);
}
