package com.melnykvl.javacore.chapter15;

interface MyFunc {
    int func(int n);
}

public class VarCapture {
    public static void main(String[] args) {

        int num = 10;

        MyFunc myLambda = n -> {
            int v = num + n;

//            num++; Ошибка при попитке видоизменить внешнюю переменную

            return v;
        };

//        num = 9; Ошибка, поскольку нарушаеться действительно завершенное состояние переменной num

    }
}
