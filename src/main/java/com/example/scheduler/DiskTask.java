package com.example.scheduler;

public class DiskTask implements Comparable<DiskTask>{
    private String name;
    private int priority;

    public DiskTask(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public void execute() {
        System.out.println("Executing task " + name);

    }


    public int compareTo(TaskFinal other) {
        return Integer.compare(priority, other.getPriority());
    }
    public int compareTo(DiskTask other) {
        return Integer.compare(priority, other.getPriority());
    }
    public int getPriority(){return this.priority;}
}
