package main.java.com.melnykvl.javacore.chapter15;

interface StrFunc {
    String func(String n);
}

public class LambdasAsArgumentsDemo {

    static String stringOp(StrFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {

        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        System.out.println("Исходная строка: " + inStr);

        outStr = stringOp(str -> str.toUpperCase(), inStr);

        System.out.println("Эта строка в верхнема регистре: " + outStr);

        outStr = stringOp(str -> {

            String result = "";

            for (int i = 0; i < str.length(); i++)
                if (str.charAt(i) != ' ')
                    result += str.charAt(i);

            return result;

        }, inStr);

        System.out.println("Это строка с удаленнымит пробелами: " + outStr);

        StrFunc reverse = str -> {

            String result = "";

            for (int i = str.length()-1; i >= 0; i--)
                result += str.charAt(i);

            return result;

        };

        System.out.println("Это обращенная строка: " + stringOp(reverse, inStr));

    }

}
