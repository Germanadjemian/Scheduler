package com.example.scheduler;

public class TaskFinal extends Task {
    private String name;
    private int priority;

    public TaskFinal(String name) {
        this.name = name;
        this.priority = 2;
    }

    public void execute() {
        System.out.println("Executing task " + name);

    }

    public int compareTo(Task other) {
        return Integer.compare(priority, other.getPriority());
    }

    /*
    public int compareTo(TaskFinal other) {
        return Integer.compare(priority, other.priority);
    }
    public int compareTo(DiskTask other) {
        return Integer.compare(priority, other.getPriority());
    }*/
    public int getPriority(){return this.priority;}
}