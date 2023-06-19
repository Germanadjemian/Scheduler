package com.example.scheduler;

import java.sql.SQLOutput;

public class SchedulerFinal
{
    public static void main(String[] args)
    {
        TaskFinal taskFinal= new TaskFinal("task1",1);
        DiskTask diskTask= new DiskTask("TASK2",2);
        System.out.println(diskTask.compareTo(taskFinal));
        System.out.println(taskFinal.compareTo(diskTask));
        System.out.println(taskFinal.compareTo(taskFinal));
        System.out.println(diskTask.compareTo(diskTask));


    }
}
