package main.java.com.melnykvl.javacore.chapter28;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class MThread implements Runnable {

    CyclicBarrier cbar;
    String name;

    MThread(CyclicBarrier c, String n) {
        cbar = c;
        name = n;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println(name);
        try {
            cbar.await();
        } catch (BrokenBarrierException e) {
            System.out.println(e);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }
}

class BarAction implements Runnable {
    @Override
    public void run() {
        System.out.println("Барьер достигнут!");
    }
}

public class BarDemo {
    public static void main(String[] args) {

        CyclicBarrier cb = new CyclicBarrier(3, new BarAction());

        System.out.println("Запуск потоков");

        new MThread(cb, "A");
        new MThread(cb, "B");
        new MThread(cb, "C");
        new MThread(cb, "X");
        new MThread(cb, "Y");
        new MThread(cb, "Z");

    }
}
