package com.example.scheduler;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class SchedulerFinal2
{
    private List<Comparable> tasks;//aca no lo uso
    private PriorityQueue<Comparable> tosk;

    public SchedulerFinal2() {
        tasks = new ArrayList<>();//CONSULTAR
        tosk= new PriorityQueue<>();
    }

    public void addTask(Comparable task) {
        tosk.offer(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void scheduleTasks() {
        // Sort tasks by their priority/ Ordenar las tareas o procesos según su prioridad
        //Collections.sort(tasks);

        for (Comparable task : tosk)
        {
            if(task instanceof DiskTask)
            {
                //DiskTask task1=(DiskTask) task;
                ((DiskTask) task).execute();/*ASI SE CASTEA la TASK que la maquina interpreta que sigue siendo solo comparable
                 */
            }
            if(task instanceof TaskFinal)
            {
                ((TaskFinal) task).execute();
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
