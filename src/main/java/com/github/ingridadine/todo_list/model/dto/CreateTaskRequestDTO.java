package com.github.ingridadine.todo_list.model.dto;

import jakarta.validation.constraints.NotBlank;

public record CreateTaskRequestDTO(@NotBlank String title, String description) {
}
