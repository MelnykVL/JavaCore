package main.java.com.melnykvl.javacore.chapter15;

interface MyArrayCreator<T> {
    T func(int n);
}

class Classic {
    private int val;

    Classic(int v) {val = v;}

    Classic() {val = 0;}

    int getVal() {return val;}
}

public class ConstructorRefDemo4 {
    public static void main(String[] args) {

        MyArrayCreator<Classic[]> mcClassCons = Classic[]::new;

        Classic[] a = mcClassCons.func(5);

        for (int i = 0; i < a.length; i++) {
            a[i] = new Classic(i);
        }

    }
}
