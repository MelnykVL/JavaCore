package main.java.com.melnykvl.javacore.task_1;

import java.util.concurrent.Semaphore;

class A implements Runnable {

    private Foo foo;
    private Semaphore sem;

    A(Semaphore sem, Foo foo) {

        this.sem = sem;
        this.foo = foo;
        try {
            sem.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(this, "A").start();

    }

    @Override
    public void run() {
        foo.first(this);
        sem.release();
    }
}

class B implements Runnable {

    private Foo foo;
    private Semaphore sem;

    B(Semaphore sem, Foo foo) {

        this.sem = sem;
        this.foo = foo;
        try {
            sem.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(this, "B").start();

    }

    @Override
    public void run() {
        foo.second(this);
        sem.release();
    }
}

class C implements Runnable {

    private Foo foo;
    private Semaphore sem;

    C(Semaphore sem, Foo foo) {

        this.sem = sem;
        this.foo = foo;
        try {
            sem.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(this, "C").start();

    }

    @Override
    public void run() {
        foo.third(this);
        sem.release();
    }
}

public class App_Task_1 {
    public static void main(String[] args) {

        Foo foo = new Foo();
        Semaphore sem = new Semaphore(1, true);

        for (int i = 0; i < 100; i++) {
            new A(sem, foo);
            new B(sem, foo);
            new C(sem, foo);
        }

    }
}