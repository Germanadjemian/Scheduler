package com.example.scheduler;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class SchedulerFinal2
{
    private PriorityQueue<Task> tasks;

    public SchedulerFinal2() {
        tasks= new PriorityQueue<>();
    }

    public void addTask(Task task) {
        tasks.offer(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void scheduleTasks() {
        // Sort tasks by their priority/ Ordenar las tareas o procesos según su prioridad
        //Collections.sort(tasks);

        while(!tasks.isEmpty())
        {
            Object o=tasks.poll();
            if(o instanceof Task){((Task) o).execute();}


        }

    }

    public static void main(String[] args)
    {
        TaskFinal taskFinal= new TaskFinal("Tarea comun 1");
        DiskTask diskTask= new DiskTask("DISK 1");
        TaskFinal taskFinal2= new TaskFinal("Tarea comun 2");
        TaskFinal taskFinal3= new TaskFinal("Tarea comun 3");
        DiskTask diskTask2= new DiskTask("DISK 2");
        TaskFinal taskFinal4= new TaskFinal("Tarea comun 4");
        TaskFinal taskFinal5= new TaskFinal("Tarea comun 5");

        SchedulerFinal2 scheduler= new SchedulerFinal2();

        scheduler.addTask(taskFinal);
        scheduler.addTask(diskTask);
        scheduler.addTask(taskFinal2);
        scheduler.addTask(taskFinal3);
        scheduler.addTask(diskTask2);
        scheduler.addTask(taskFinal4);
        scheduler.addTask(taskFinal5);

        scheduler.scheduleTasks();

    }
}
