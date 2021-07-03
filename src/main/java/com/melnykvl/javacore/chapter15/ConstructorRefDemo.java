package main.java.com.melnykvl.javacore.chapter15;

interface Funct {
    MClass func(int n);
}

class MClass {
    private int val;

    MClass(int v) {val = v;}

    MClass() {val = 0;}

    int getVal() {return val;}
}

public class ConstructorRefDemo {
    public static void main(String[] args) {

        Funct myClassCons = MClass::new;

        MClass mc = myClassCons.func(100);

        System.out.println("Значение val в объекте mc равно " + mc.getVal());

    }
}
