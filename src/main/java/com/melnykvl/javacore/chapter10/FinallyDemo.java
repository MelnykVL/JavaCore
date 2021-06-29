package main.java.com.melnykvl.javacore.chapter10;

public class FinallyDemo {

    static void procA() {
        try {
            System.out.println("From procA().");
            throw new RuntimeException("Demonstrate");
        } finally {
            System.out.println("Finally block from procA().");
        }
    }

    static void procB() {
        try {
            System.out.println("From procB()");
            return;
        } finally {
            System.out.println("Finally block from procB().");
        }
    }

    static void procC() {
        try {
            System.out.println("From procC()");
            return;
        } finally {
            System.out.println("Finally block from procC().");
        }
    }

    public static void main(String[] args) {

        try {
            procA();
        } catch (Exception e) {
            System.out.println("Exception is caught.");
        }
        procB();
        procC();

    }

}
