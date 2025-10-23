package com.github.ingridadine.todo_list.controller;

import com.github.ingridadine.todo_list.model.dto.CreateTaskRequestDTO;
import com.github.ingridadine.todo_list.model.dto.TaskResponseDTO;
import com.github.ingridadine.todo_list.service.TaskService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @Operation(
            summary = "Create a task :}",
            description = "Create a task.",
            tags = {"Task"},
            operationId = "createTask"
    )
    @PostMapping
    public TaskResponseDTO createTask(@RequestBody CreateTaskRequestDTO requestDTO) {
        return taskService.createTask(requestDTO);
    }
}
