package com.example.scheduler;

import java.util.concurrent.Semaphore;
public class Filosofo implements Runnable {

    private int id;
    private Semaphore[] tenedores;

    public Filosofo(int id, Semaphore[] tenedores) {
        this.id = id;
        this.tenedores = tenedores;
    }

    private void pensar() throws InterruptedException {
        System.out.println("Filósofo " + id + " está pensando.");
        Thread.sleep((long) (Math.random() * 10000)); // El filósofo piensa durante un tiempo aleatorio
    }

    private void comer() throws InterruptedException {
        System.out.println("Filósofo " + id + " está comiendo.");
        Thread.sleep((long) (Math.random() * 10000)); // El filósofo come durante un tiempo aleatorio
    }

    public void run() {
        try {
            while (true) {
                pensar();
                tenedores[id].acquire(); // El filósofo toma su tenedor izquierdo
                tenedores[(id + 1) % 5].acquire(); // El filósofo toma su tenedor derecho
                comer();
                tenedores[id].release(); // El filósofo libera su tenedor izquierdo
                tenedores[(id + 1) % 5].release(); // El filósofo libera su tenedor derecho
            }
        } catch (InterruptedException e) {
            System.out.println("Filósofo " + id + " interrumpido.");
        }
    }

    public static void main(String[] args) {
        Semaphore[] tenedores = new Semaphore[5];
        for (int i = 0; i < 5; i++) {
            tenedores[i] = new Semaphore(1); // Cada tenedor se inicializa con un permiso
        }
        Filosofo[] filosofos = new Filosofo[5];
        for (int i = 0; i < 5; i++) {
            filosofos[i] = new Filosofo(i, tenedores);
            new Thread(filosofos[i]).start();
        }
    }
}
