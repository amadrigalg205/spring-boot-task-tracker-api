package com.salud360.demo.tasktracker.service;

import com.salud360.demo.tasktracker.model.Task;

import java.util.List;
import java.util.UUID;

public interface TaskService {
    Task createTask(String title);
    
    List<Task> getAllTasks();
    
    void completeTask(UUID id);
}


