package com.github.ingridadine.todo_list.model.repository;

import com.github.ingridadine.todo_list.model.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
