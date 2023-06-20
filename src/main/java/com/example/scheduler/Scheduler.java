package com.example.scheduler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Scheduler {
    private List<OriginalTask> tasks;

    public Scheduler() {
        tasks = new ArrayList<>();
    }

    public void addOriginalTask(OriginalTask task) {
        tasks.add(task);
    }

    public void removeOriginalTask(OriginalTask task) {
        tasks.remove(task);
    }

    public void scheduleOriginalTasks() {
        // Sort tasks by their priority/ Ordenar las tareas o procesos según su prioridad
        Collections.sort(tasks);

        // Execute tasks in order / Ejecutar las tareas/procesos en orden
        for (OriginalTask task : tasks) {
            task.execute();
        }
    }
    public static void main(String[] args)
    {
        Scheduler scheduler= new Scheduler();
        OriginalTask task1= new OriginalTask("Tarea 1",1);
        OriginalTask task2= new OriginalTask("Tarea 2",5);
        OriginalTask task3= new OriginalTask("Tarea 3",3);
        scheduler.addOriginalTask(task1);
        scheduler.addOriginalTask(task2);
        scheduler.addOriginalTask(task3);
        scheduler.scheduleOriginalTasks();

    }
}