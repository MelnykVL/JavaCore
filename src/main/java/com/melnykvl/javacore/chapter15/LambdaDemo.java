package com.melnykvl.javacore.chapter15;

interface MyNumber {
    double getValue();
}

public class LambdaDemo {
    public static void main(String[] args) {

        MyNumber myNum;
        myNum = () -> 123.45;

        System.out.println("Static value: " + myNum.getValue());

        myNum = () -> Math.random() * 100;

        System.out.println("Random value 1: " + myNum.getValue());
        System.out.println("Random value 2: " + myNum.getValue());

//        myNum = () -> "123.03"; !----Error----!

    }
}
