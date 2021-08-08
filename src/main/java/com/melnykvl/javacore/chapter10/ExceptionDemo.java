package com.melnykvl.javacore.chapter10;

class MyException extends Exception {
    private int detail;
    MyException (int a) {
        detail = a;
    }
    public String toString() {
        return "MyException[" + detail + "]";
    }
}

public class ExceptionDemo {

    static void compute(int a) throws MyException {
        System.out.println("Method compute(" + a + ") called");
        if (a > 10)
            throw new MyException(a);
        System.out.println("Correct completion");
    }

    public static void main(String[] args) {

        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("Exception is caught: " + e);
        }

    }

}
