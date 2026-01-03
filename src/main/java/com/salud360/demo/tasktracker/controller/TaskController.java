package com.salud360.demo.tasktracker.controller;

import com.salud360.demo.tasktracker.model.CreateTaskRequest;
import com.salud360.demo.tasktracker.model.Task;
import com.salud360.demo.tasktracker.service.TaskService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    
    private final TaskService taskService;
    
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    
    @Operation(summary = "Create a new task")
    @PostMapping
    public Task createTask(@Valid @RequestBody CreateTaskRequest request) {
        return taskService.createTask(request.getTitle());
    }
    
    @Operation(summary = "List all tasks")
    @GetMapping
    public List<Task> listTasks() {
        return taskService.getAllTasks();
    }
    
    @Operation(summary = "Mark a task as completed")
    @PutMapping("/{id}")
    public void completeTask(@PathVariable UUID id) {
        taskService.completeTask(id);
    }
}

