package com.melnykvl.javacore.chapter15;

interface StringFunct {
    String func(String n);
}

class MyStringOp {
    String strReverse(String str) {
        String result = "";

        for (int i = str.length()-1; i >= 0; i--)
            result += str.charAt(i);

        return result;
    }
}

public class MethodRefDemo2 {

    static String stringOp(StringFunct sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {

        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        MyStringOp strOps = new MyStringOp();

        outStr = stringOp(MyStringOps::strReverse, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);

    }
}
