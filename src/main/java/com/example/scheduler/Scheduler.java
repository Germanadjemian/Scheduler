package com.example.scheduler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Scheduler {
    private List<Task> tasks;

    public Scheduler() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void scheduleTasks() {
        // Sort tasks by their priority/ Ordenar las tareas o procesos según su prioridad
        Collections.sort(tasks);

        // Execute tasks in order / Ejecutar las tareas/procesos en orden
        for (Task task : tasks) {
            task.execute();
        }
    }
    public static void main(String[] args)
    {
        Scheduler scheduler= new Scheduler();
        Task task1= new Task("Tarea 1",1);
        Task task2= new Task("Tarea 2",5);
        Task task3= new Task("Tarea 3",3);
        scheduler.addTask(task1);
        scheduler.addTask(task2);
        scheduler.addTask(task3);
        scheduler.scheduleTasks();
    }
}