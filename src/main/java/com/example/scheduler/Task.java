package com.example.scheduler;

class Task implements Comparable<Task> {
    private String name;
    private int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public void execute() {
        System.out.println("Executing task " + name);

    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(priority, other.priority);
    }
}