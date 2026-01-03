package com.salud360.demo.tasktracker.exception;

public class TaskAlreadyCompletedException extends RuntimeException {
    public TaskAlreadyCompletedException(String message) {
        super(message);
    }
}


