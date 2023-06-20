package com.example.scheduler;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        int cant = 5;
        Semaphore palitos[] = new Semaphore[cant];
        for(int i = 0; i < cant; i++) {
            palitos[i] = new Semaphore(1);
        }
        FilosofoSegundaVersion filosofos[] = new FilosofoSegundaVersion[cant];
        for(int i = 0; i < cant; i++) {
            if(i != 3) {
                filosofos[i] = new FilosofoSegundaVersion(i, palitos[i], palitos[(i + 1) % cant]);
            } else {
                filosofos[i] = new FilosofoSegundaVersion(i, palitos[(i + 1) % cant], palitos[i]);
            }
            new Thread(filosofos[i]).start();
        }
    }
}

