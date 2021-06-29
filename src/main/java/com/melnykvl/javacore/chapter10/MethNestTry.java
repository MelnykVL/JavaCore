package main.java.com.melnykvl.javacore.chapter10;

public class MethNestTry {

    static void nestTry(int a) {
        try {
            if(a == 1) a = a/(a-a);
            if (a == 2) {
                int[] c = {1};
                c[42] = 99;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e);
        }
    }

    public static void main(String[] args) {

        try {
            int a = 2;
            int b = 42/a;
            System.out.println("a = " + a);
            nestTry(a);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero: " + e);
        }
        System.out.println("The END");

    }

}
