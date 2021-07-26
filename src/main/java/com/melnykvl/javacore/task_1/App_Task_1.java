package main.java.com.melnykvl.javacore.task_1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class App_Task_1 {

    public static void main(String[] args) {

        Foo foo = new Foo();

        CompletableFuture future3 = CompletableFuture.runAsync(() -> foo.third(() -> { }));
        CompletableFuture future1 = CompletableFuture.runAsync(() -> foo.first(() -> { }));
        CompletableFuture future2 = CompletableFuture.runAsync(() -> foo.second(() -> { }));

        CompletableFuture all = CompletableFuture.allOf(future2, future3, future1);

        all.join();

//        for (int i = 0; i < 50; i++) {
//            CompletableFuture future1 = CompletableFuture.runAsync(() -> foo.first(() -> { }));
//            CompletableFuture future3 = CompletableFuture.runAsync(() -> foo.third(() -> { }));
//            CompletableFuture future2 = CompletableFuture.runAsync(() -> foo.second(() -> { }));
//
//            CompletableFuture all = CompletableFuture.allOf(future3, future1, future2);
//
//            try {
//                all.get();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } catch (ExecutionException e) {
//                e.printStackTrace();
//            }
//        }

//        for (int i = 0; i < 50; i++) {
//            CompletableFuture future1 = CompletableFuture.runAsync(() -> foo.first(() -> { }));
//            CompletableFuture future3 = CompletableFuture.runAsync(() -> foo.third(() -> { }));
//            CompletableFuture future2 = CompletableFuture.runAsync(() -> foo.second(() -> { }));
//
//            waitALittle();
//        }

    }

    public static void waitALittle() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}