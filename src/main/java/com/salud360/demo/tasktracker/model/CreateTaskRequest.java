package com.salud360.demo.tasktracker.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CreateTaskRequest {
    @NotBlank(message = "Title is required")
    @Size(min = 1, max = 255, message = "Title must be between 1 and 255 characters")
    private String title;

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "CreateTaskRequest{" +
                "title='" + title + '\'' +
                '}';
    }
}

