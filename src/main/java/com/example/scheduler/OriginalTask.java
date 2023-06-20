package com.example.scheduler;

class OriginalTask implements Comparable<OriginalTask> {
    private String name;
    private int priority;

    public OriginalTask(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public void execute() {
        System.out.println("Executing task " + name);

    }

    @Override
    public int compareTo(OriginalTask other) {
        return Integer.compare(priority, other.priority);
    }
}