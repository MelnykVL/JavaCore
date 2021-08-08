package com.melnykvl.javacore.chapter10;

public class Exc2 {
    public static void main(String[] args) {
        int d, a;

        try {

            d = 0;
            a = 42/d;
            System.out.println("Hi from try");

        } catch (ArithmeticException e) {
            System.out.println("Hi from catch");
        }

        System.out.println("The END");
    }
}
