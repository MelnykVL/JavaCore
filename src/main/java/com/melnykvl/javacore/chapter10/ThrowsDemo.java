package main.java.com.melnykvl.javacore.chapter10;

public class ThrowsDemo {

    static void throwOne() throws IllegalAccessException {
        System.out.println("Hello from throwOne().");
        throw new IllegalAccessException();
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Exception is caught:" + e);
        }
    }

}
