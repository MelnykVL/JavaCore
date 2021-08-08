package com.melnykvl.javacore.task_1;

import java.util.concurrent.Semaphore;

class Foo {

    Semaphore sem1 = new Semaphore(0);
    Semaphore sem2 = new Semaphore(0);

    public void first(Runnable r) {
        try {
            System.out.print("first");
        } finally {
            sem1.release();
        }
    }
    public void second(Runnable r) {
        try {
            sem1.acquire();
            System.out.print("second");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            sem2.release();
        }
    }
    public void third(Runnable r) {
        try {
            sem2.acquire();
            System.out.println("third");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            sem1.release();
            sem2.release();
        }
    }

}
