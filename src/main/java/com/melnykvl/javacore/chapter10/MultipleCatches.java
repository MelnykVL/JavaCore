package com.melnykvl.javacore.chapter10;

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = 1;
            System.out.println("a = " + a);
            int b = 42/a;
            int[] c = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero:" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds:" + e);
        }
        System.out.println("The END");
    }
}
