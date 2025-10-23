package com.github.ingridadine.todo_list.model.dto;

import com.github.ingridadine.todo_list.model.enumeration.TaskStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.Instant;

public record TaskResponseDTO(@NotNull Long id, @NotBlank String title, String description, @NotNull TaskStatus status, @NotNull
                                    Instant createdAt, Instant updatedAt) {
}
