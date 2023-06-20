package com.example.scheduler;

public abstract class Task implements Comparable<Task> {
    String name;
    int priority;



    public void execute() {
        System.out.println("Executing task " + name);

    }

    @Override
    public int compareTo(Task otherTask) {
        return Integer.compare(this.priority, otherTask.priority);
    }
    public int getPriority(){return this.priority;}
}