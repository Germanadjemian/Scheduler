package com.example.scheduler.PROBAR;

import com.example.scheduler.DiskTask;
import com.example.scheduler.Sleeper;
import com.example.scheduler.TaskFinal;

import java.time.DayOfWeek;
import java.time.Instant;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class PRUEBAS
{
    public static void main(String[] args) throws InterruptedException {

        /*Instant instant= Instant.now();
        System.out.println(instant);
        System.out.println(instant.toString());

        System.out.println("------------------------------------------------------------------");

        TaskFinal taskFinal= new TaskFinal("task1");
        DiskTask diskTask= new DiskTask("TASK2");
        System.out.println(diskTask.compareTo(taskFinal));//comparo desde DiskTask con Task
        System.out.println(taskFinal.compareTo(diskTask));//Comparo desde una task comun con DiskTask

        Sleeper sleeper= new Sleeper();
        sleeper.runWithDelay(() ->System.out.println("SALIO BIEN"),3,TimeUnit.SECONDS);
        Thread.sleep(3001);

        System.out.println(taskFinal.compareTo(taskFinal));
        System.out.println(diskTask.compareTo(diskTask));*/
        //COMENTARIO
        /*
        PriorityQueue nombres= new PriorityQueue<String>();//no importa el parametro que le pase en <> ni idea porque toma todo pero se adapta al tipo del primer objeto insertado
        nombres.offer("Juan");
        nombres.offer("Pepe");
        nombres.offer("Matias");

        for(Object nombre: nombres){
            System.out.println(nombre);
            //System.out.println(nombres.poll()); NO ANDA
        }


        PriorityQueue numeros= new PriorityQueue<Comparable>();
        numeros.offer(10);
        numeros.offer(4);
        numeros.offer(1);//no entiendo el orden en que se imprimen
        numeros.offer(7);
        System.out.println("EL TAMAÑO ES "+numeros.size());


        for(Object numero: numeros){
            System.out.println(numero);
            //System.out.println(nombres.poll()); NO ANDA
        }
        System.out.println("-------------------------------------------------");
        for (int i=0;i<=numeros.size()+4;i++)// Si le pongo 1 o nada no imprime el 10, si le pongo 2 lo imprime, si es 3 lo imprime tambien y apartir de 4 me imprime un null NI IDEA PORQUE
        {
            System.out.println(numeros.poll());
        }
        System.out.println("-------------------------");

        PriorityQueue numeros2= new PriorityQueue<Comparable>();
        numeros2.offer(10);
        numeros2.offer(4);
        numeros2.offer(1);//no entiendo el orden en que se imprimen
        numeros2.offer(7);

        while(!numeros2.isEmpty())
        {
            System.out.println(numeros2.poll());
        }
        */
        //COMENTARIO

        PriorityQueue numeros= new PriorityQueue<Comparable>();
        numeros.offer(10);
        numeros.offer(4);
        numeros.offer(1);//no entiendo el orden en que se imprimen
        numeros.offer(7);
        //long cont=2;
        Sleeper sleeper = new Sleeper();

        Timer timer = new Timer();
        TimerTask task = new TimerTask()
        {
            int cont = 2;
            @Override
            public void run() {
                numeros.poll();
                System.out.println("Tamaño " + numeros.size() + " esta vacia " + numeros.isEmpty());
                if(numeros.isEmpty()){
                    timer.cancel();
                }
            }
        };
        timer.schedule(task, 3000, 1000);
        /*
        while(!numeros.isEmpty())
        {
          //  sleeper.runWithDelay(() -> System.out.println(numeros.poll()),cont,TimeUnit.SECONDS);
            numeros.poll();
            System.out.println("Tamaño " + numeros.size() + "esta vacia " + numeros.isEmpty());

            cont++;
        }
        System.out.println(numeros.size());

         */
        /*System.out.println(numeros.isEmpty());


        PriorityQueue tareas= new PriorityQueue<Comparable>();
        TaskFinal taskFinal= new TaskFinal("COMMON 1");
        DiskTask diskTask= new DiskTask("DISK 1");
        TaskFinal taskFinal2= new TaskFinal("COMMON 2");
        DiskTask diskTask2= new DiskTask("DISK 2");
        TaskFinal taskFinal3= new TaskFinal("COMMON 3");*/

        //tareas.offer(taskFinal);
        //tareas.offer(taskFinal2);
        //tareas.offer(diskTask);
        //tareas.offer(diskTask2);
        //tareas.offer(taskFinal3);

        /*while(!tareas.isEmpty())
        {
            Object o=tareas.poll();
            if(o instanceof DiskTask){((DiskTask) o).execute();}
            if(o instanceof TaskFinal){((TaskFinal) o).execute();}
        }*/

    }
}
