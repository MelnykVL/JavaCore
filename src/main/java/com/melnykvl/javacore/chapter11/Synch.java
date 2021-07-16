package main.java.com.melnykvl.javacore.chapter11;

class Callme {
    synchronized void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {

    String msg;
    Callme target;
    Thread t;

    public Caller(Callme target, String s) {
        this.target = target;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        target.call(msg);
    }

}

public class Synch {
    public static void main(String[] args) {

        Callme target = new Callme();
        Caller c1 = new Caller(target, "Добро пожаловать");
        Caller c2 = new Caller(target, "в синхронизированный");
        Caller c3 = new Caller(target, "мир!");

        try {
            c1.t.join();
            c2.t.join();
            c3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }

    }
}
