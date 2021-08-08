package com.melnykvl.javacore.chapter13;

class A {
    int i, j;
}
class B {
    int i, j;
}
class C extends A {
    int k;
}
class D extends A {
    int k;
}

public class InstanceOf {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if (a instanceof A)
            System.out.println("a is instance of A");
        if (b instanceof B)
            System.out.println("b is instance of B");
        if (c instanceof C)
            System.out.println("c is instance of C");

        if (c instanceof A)
            System.out.println("c can be instance of A");
        if (a instanceof C)
            System.out.println("a can be instance of C");

        System.out.println();

        A ob;
        ob = d;
        System.out.println("ob refer to d");
        if (ob instanceof D)
            System.out.println("ob is instance of D");

        System.out.println();

        ob = c;
        System.out.println("ob refer to c");

        if (ob instanceof D)
            System.out.println("ob can be instance D");
        else
            System.out.println("ob can't be instance of D");

        if (ob instanceof A)
            System.out.println("ob can be instance of A");

        System.out.println();

        if (a instanceof Object)
            System.out.println("a can be instance of Object");
        if (b instanceof Object)
            System.out.println("b can be instance of Object");
        if (c instanceof Object)
            System.out.println("c can be instance of Object");
        if (d instanceof Object)
            System.out.println("d can be instance of Object");


    }
}
