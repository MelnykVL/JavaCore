package main.java.com.melnykvl.javacore.chapter10;

public class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("Demonstrate");
        } catch (NullPointerException e) {
            System.out.println("Exception is caught in demoproc() method body .");
            throw e;
        }
    }
    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Catch again:" + e);
        }
    }
}
