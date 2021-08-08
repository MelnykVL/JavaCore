package com.melnykvl.javacore.chapter10;

import java.util.Random;

public class HandleError {
    public static void main(String[] args) {
        int a =  0, b = 0, c = 0;
        Random rand = new Random();

        for (int i = 0; i < 32000; i++) {

            try {
                b = rand.nextInt();
                c = rand.nextInt();
                a = 12345 / (b/c);
            } catch (ArithmeticException e) {
                System.out.println("Exception:" + e);
                a = 0;
            }

            System.out.println("a: " + a);

        }
    }
}
