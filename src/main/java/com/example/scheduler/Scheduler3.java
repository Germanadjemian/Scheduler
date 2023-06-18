package com.example.scheduler;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Scheduler3 {

        private List<Task> tasks;

        public Scheduler3() {
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
    public static void main(String[] args) {
        // Asignar 2 segundos a una variable
        Duration dosSegundos = Duration.ofSeconds(2);

        // Imprimir el valor de la variable
        System.out.println(dosSegundos);
        Duration tresSegundos = Duration.ofSeconds(3);
        System.out.println(tresSegundos.compareTo(dosSegundos));

        Instant instant = Instant.now();
        long current=System.currentTimeMillis();
        long tiempoActualSegundos = instant.getEpochSecond();
        System.out.println(tiempoActualSegundos);
        System.out.println(current/1000);
        Instant instant2= Instant.now();
        long t2= instant2.getEpochSecond();
        System.out.println("El proceso duro: "+(System.currentTimeMillis()-current)+" milisegundos");
        System.out.println("El segundo proceso duro "+(t2-tiempoActualSegundos));
    }
}
