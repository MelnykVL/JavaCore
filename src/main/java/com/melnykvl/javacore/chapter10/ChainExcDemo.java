package com.melnykvl.javacore.chapter10;

public class ChainExcDemo {

    static void demoproc() {
        NullPointerException e = new NullPointerException("high level");
        e.initCause(new ArithmeticException("cause"));
        throw e;
    }

    public static void main(String[] args) {

        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Exception is caught: " + e);
            System.out.println("Root cause: " + e.getCause());
        }

    }

}
