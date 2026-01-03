package com.salud360.demo.tasktracker.service;

import com.salud360.demo.tasktracker.exception.TaskAlreadyCompletedException;
import com.salud360.demo.tasktracker.exception.TaskNotFoundException;
import com.salud360.demo.tasktracker.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class TaskServiceImpl implements TaskService {
    
    private final List<Task> tasks = new ArrayList<>();
    
    @Override
    public Task createTask(String title) {
        UUID id = UUID.randomUUID();
        Task task = new Task(id, title, false);
        tasks.add(task);
        return task;
    }
    
    @Override
    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks);
    }
    
    @Override
    public void completeTask(UUID id) {
        Task task = tasks.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new TaskNotFoundException("Task with id " + id + " not found"));
        
        if (task.isCompleted()) {
            throw new TaskAlreadyCompletedException("Task with id " + id + " is already completed");
        }
        
        task.setCompleted(true);
    }
}

