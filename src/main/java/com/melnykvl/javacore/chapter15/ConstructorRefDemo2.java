package main.java.com.melnykvl.javacore.chapter15;

interface F<T> {
    MyCl<T> func(T n);
}

class MyCl<T> {
    private T val;

    MyCl(T v) {val = v;}
    MyCl() {val = null;}

    T getVal() {return val;}
}

public class ConstructorRefDemo2 {
    public static void main(String[] args) {

        F<Integer> myClassCons = MyCl<Integer>::new;

        MyCl<Integer> mc = myClassCons.func(100);

        System.out.println("Значение val в объекте mc равно " + mc.getVal());

    }
}
