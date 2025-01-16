package com.example.todolistapp;

public class Task {

    private String taskName;
    private String dateTime;
    private boolean isCompleted;

    // Constructor
    public Task(String taskName, String dateTime) {
        this.taskName = taskName;
        this.dateTime = dateTime;
        this.isCompleted = false; // Default value for new tasks
    }

    // Getters and Setters
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
