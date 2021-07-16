package main.java.com.melnykvl.javacore.chapter11;

class NThread implements Runnable {

    String name;
    Thread t;
    boolean suspendFlag;

    NThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        suspendFlag = false;
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag)
                        wait();
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван.");
        }
        System.out.println(name + " завершен.");
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }

}

public class SuspendResume {
    public static void main(String[] args) {

        NThread t1 = new NThread("Один");
        NThread t2 = new NThread("Два");

        try {

            Thread.sleep(1000);
            t1.mysuspend();
            System.out.println("Приостановка потока Один");

            Thread.sleep(1000);
            t1.myresume();
            System.out.println("Возобновление потока Один");

            t2.mysuspend();
            System.out.println("Приостановка потока Два");

            Thread.sleep(1000);
            t2.myresume();
            System.out.println("Возобновление потока Два");

        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }

        try {

            System.out.println("Ожидание завершения потоков.");
            t1.t.join();
            t2.t.join();

        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }

        System.out.println("Главный поток завершен");

    }
}
