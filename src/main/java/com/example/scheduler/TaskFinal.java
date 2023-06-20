package com.example.scheduler;

public class TaskFinal implements Comparable<DiskTask> {
    private String name;
    private int priority;

    public TaskFinal(String name) {
        this.name = name;
        this.priority = 1;
    }

    public void execute() {
        System.out.println("Executing task " + name);

    }


    public int compareTo(TaskFinal other) {
        return Integer.compare(priority, other.priority);
    }
    public int compareTo(DiskTask other) {
        return Integer.compare(priority, other.getPriority());
    }
    public int getPriority(){return this.priority;}
}