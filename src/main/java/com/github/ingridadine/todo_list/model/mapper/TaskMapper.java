package com.github.ingridadine.todo_list.model.mapper;

import com.github.ingridadine.todo_list.model.dto.TaskResponseDTO;
import com.github.ingridadine.todo_list.model.entity.Task;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    TaskResponseDTO toDTO(Task task);
}
