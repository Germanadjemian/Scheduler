package com.example.scheduler;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Sleeper
{
    public void runWithDelay(Runnable runnable, long time, TimeUnit timeUnit)
    {
        ScheduledExecutorService executorService= Executors.newSingleThreadScheduledExecutor();
        executorService.schedule(runnable,time,timeUnit);
        executorService.shutdown();

    }
}
