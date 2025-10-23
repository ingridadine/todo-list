package com.github.ingridadine.todo_list.service;

import com.github.ingridadine.todo_list.model.dto.CreateTaskRequestDTO;
import com.github.ingridadine.todo_list.model.dto.TaskResponseDTO;
import com.github.ingridadine.todo_list.model.entity.Task;
import com.github.ingridadine.todo_list.model.enumeration.TaskStatus;
import com.github.ingridadine.todo_list.model.mapper.TaskMapper;
import com.github.ingridadine.todo_list.model.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;
    private final TaskMapper taskMapper;

    public TaskResponseDTO createTask(CreateTaskRequestDTO requestDTO) {
        var task = Task.builder().title(requestDTO.title())
                .description(requestDTO.description())
                .status(TaskStatus.TODO)
                .build();

        return taskMapper.toDTO(taskRepository.save(task));
    }
}
