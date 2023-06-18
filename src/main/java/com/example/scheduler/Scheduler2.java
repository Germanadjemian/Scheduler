package com.example.scheduler;

import java.time.Duration;
import java.time.Instant;

public class Scheduler2 {
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
        for(long i=1;i<999999999;i++){for(int a=1;a<99999999;a++){}}
        System.out.println("El proceso duro: "+(System.currentTimeMillis()-current)+" milisegundos");
    }
}
//s=10
//y=s+1
//print(y+s)

