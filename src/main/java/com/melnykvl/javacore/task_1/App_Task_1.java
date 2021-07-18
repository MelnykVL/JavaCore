package main.java.com.melnykvl.javacore.task_1;

class Foo {
    public void first(Runnable r) {
        System.out.print("first");
    }
    public void second(Runnable r) {
        System.out.print("second");
    }
    public void third(Runnable r) {
        System.out.print("third");
    }
}

class A implements Runnable {

    private Foo foo;
    private Thread thread;

    A(Foo foo) {

        this.foo = foo;
        thread = new Thread(this, "A");

    }

    @Override
    public void run() {

        foo.first(this);

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            System.out.println(thread.getName() + " was interrupted");
//        }

    }
}

class B implements Runnable {

    private Foo foo;
    private Thread thread;

    B(Foo foo) {

        this.foo = foo;
        thread = new Thread(this, "B");

    }

    @Override
    public void run() {

        foo.second(this);

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            System.out.println(thread.getName() + " was interrupted");
//        }

    }
}

class C implements Runnable {

    private Foo foo;
    private Thread thread;

    C(Foo foo) {

        this.foo = foo;
        thread = new Thread(this, "C");

    }

    @Override
    public void run() {

        foo.third(this);

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            System.out.println(thread.getName() + " was interrupted");
//        }

    }
}

public class App_Task_1 {
    public static void main(String[] args) {

        Foo foo = new Foo();

        Thread a = new Thread(new A(foo));
        Thread b = new Thread(new B(foo));
        Thread c = new Thread(new C(foo));

        a.start();
        try {
            a.join();
            b.start();
            b.join();
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
