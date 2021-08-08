package com.melnykvl.javacore.chapter11;

class NewThread2 implements Runnable {

    String name;
    Thread t;

    NewThread2(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершен");
    }

}

public class MultiThreadDemo {
    public static void main(String[] args) {

        new NewThread2("Один");
        new NewThread2("Два");
        new NewThread2("Три");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен.");

    }
}
