package com.example.scheduler;



    import java.util.concurrent.Semaphore;

    public class FilosofoSegundaVersion implements Runnable{
        private final int id;
        private final Semaphore izq;
        private final Semaphore der;

        public FilosofoSegundaVersion(int id, Semaphore izq, Semaphore der) {
            this.id = id;
            this.izq = izq;
            this.der = der;
        }

        @Override
        public void run() {
            try {
                //comer(); // Descomentar ambas líneas para testear si provoca Deadlock
                while(true) {
                    if((int)(Math.random() * 2) == 0) {
                        pensar();
                    } else {
                        comer();
                    }
                }
            } catch (InterruptedException ex) {
            }
        }

        public void pensar() throws InterruptedException {
            System.out.println("\t".repeat(id * 2) + id + ": Pensando");
            Thread.sleep((long)(Math.random() * 500));
        }

        public void comer() throws InterruptedException {
            System.out.println("\t".repeat(id * 2) + id + ": Hambre");
            der.acquire();
            //Thread.sleep((long)(Math.random() * 500)); // Descomentar ambas líneas para testear si provoca Deadlock
            izq.acquire();
            System.out.println("\t".repeat(id * 2) + id + ": Comiendo");
            Thread.sleep((long)(Math.random() * 500));
            izq.release();
            der.release();
        }
    }