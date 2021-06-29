package main.java.com.melnykvl.javacore.chapter10;

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42/a;
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
//        } catch (ArithmeticException e) {
//            System.out.println("There will error");
//        }
    }
}
