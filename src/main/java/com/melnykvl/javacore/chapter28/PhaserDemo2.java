package main.java.com.melnykvl.javacore.chapter28;

import java.util.concurrent.Phaser;

class MyPhaser extends Phaser {

    int numPhases;

    MyPhaser(int parties, int phaseCount) {
        super(parties);
        numPhases = phaseCount - 1;
    }

    @Override
    protected boolean onAdvance(int phase, int registeredParties) {
        System.out.println("Фаза " + phase + " завершена.\n");

        if (phase == numPhases || registeredParties == 0) return true;

        return false;
    }
}

class MyThread2 implements Runnable {

    Phaser phsr;
    String name;

    MyThread2(Phaser p, String n) {
        phsr = p;
        name = n;
        phsr.register();
        new Thread(this).start();
    }

    @Override
    public void run() {

        while (!phsr.isTerminated()) {

            System.out.println("Поток " + name + " начинает фазу " + phsr.getPhase());
            phsr.arriveAndAwaitAdvance();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

        }
    }
}

public class PhaserDemo2 {
    public static void main(String[] args) {

        MyPhaser phsr = new MyPhaser(1, 4);

        System.out.println("Запуск потоков");

        new MyThread2(phsr, "A");
        new MyThread2(phsr, "B");
        new MyThread2(phsr, "C");

        while (!phsr.isTerminated())
            phsr.arriveAndAwaitAdvance();

        System.out.println("Синхронизатор фаз завершен");

    }
}
