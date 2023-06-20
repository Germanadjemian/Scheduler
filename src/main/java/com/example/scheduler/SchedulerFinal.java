package com.example.scheduler;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class SchedulerFinal
{
    private List<Comparable> tasks;
    private PriorityQueue<Comparable> tosk;

    public SchedulerFinal() {
        tasks = new ArrayList<>();//CONSULTAR
        tosk= new PriorityQueue<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void scheduleTasks()
    {
        // Sort tasks by their priority/ Ordenar las tareas o procesos según su prioridad
        //Collections.sort(tasks);

        // Execute tasks in order / Ejecutar las tareas/procesos en orden
        for (Comparable task : tasks)
        {
            if(task instanceof DiskTask)
            {
                //DiskTask task1=(DiskTask) task;
                ((DiskTask) task).execute();//ASI SE CASTEA la TASK que la maquina interpreta que sigue siendo solo comparable

            }
        }

        for (Comparable task : tasks)
        {
            if(task instanceof TaskFinal)
            {
                //DiskTask task1=(DiskTask) task;
                ((TaskFinal) task).execute();//ASI SE CASTEA la TASK que la maquina interpreta que sigue siendo solo comparable

            }
        }



    }

    public static void main(String[] args)
    {
        /*
        TaskFinal taskFinal= new TaskFinal("task1",1);
        DiskTask diskTask= new DiskTask("TASK2",2);
        System.out.println(diskTask.compareTo(taskFinal));
        System.out.println(taskFinal.compareTo(diskTask));
        System.out.println(taskFinal.compareTo(taskFinal));
        System.out.println(diskTask.compareTo(diskTask));*/

    }
}
