package main.java.com.melnykvl.javacore.task_1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

class A implements Runnable {

    private Foo foo;

    A(Foo foo) {
        this.foo = foo;
    }

    @Override
    public void run() {
        foo.first(this);
    }
}

class B implements Runnable {

    private Foo foo;

    B(Foo foo) {
        this.foo = foo;
    }

    @Override
    public void run() {
        foo.second(this);
    }
}

class C implements Runnable {

    private Foo foo;

    C(Foo foo) {
        this.foo = foo;
    }

    @Override
    public void run() {
        foo.third(this);
    }
}

public class App_Task_1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Foo foo = new Foo();

        for (int i = 0; i < 100; i++) {
            CompletableFuture
                    .runAsync(new A(foo))
                    .thenRun(new B(foo))
                    .thenRun(new C(foo)).join();
        }

    }
}