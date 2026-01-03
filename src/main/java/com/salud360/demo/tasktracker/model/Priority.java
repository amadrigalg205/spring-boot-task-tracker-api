package com.salud360.demo.tasktracker.model;

public enum Priority {
    URGENT_AND_IMPORTANT("Urgent and important"),
    IMPORTANT_BUT_NOT_URGENT("Important but not urgent"),
    URGENT_BUT_NOT_IMPORTANT("Urgent but not important"),
    DEFAULT("Default");

    private final String description;

    Priority(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

