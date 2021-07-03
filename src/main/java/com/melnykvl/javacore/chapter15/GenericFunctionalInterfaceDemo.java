package main.java.com.melnykvl.javacore.chapter15;

interface SomeFunc<T> {
    T func(T t);
}

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {

        SomeFunc<String> reverse = str -> {
            String result = "";

            for (int i = str.length()-1; i >= 0; i--) {
                result += str.charAt(i);
            }

            return result;
        };

        System.out.println("Lambda => " + reverse.func("Lambda"));
        System.out.println("Expression => " + reverse.func("Expression"));

        SomeFunc<Integer> factorial = n -> {
            int result = 1;

            for (int i = 1; i <= n; i++) {
                result = i * result;
            }

            return result;
        };

        System.out.println("Factorial 3 = " + factorial.func(3));
        System.out.println("Factorial 5 = " + factorial.func(5));

    }
}
