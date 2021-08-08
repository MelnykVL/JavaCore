package com.melnykvl.javacore.chapter20;

import java.io.*;

class MyCl implements Serializable {
    String s;
    int i;
    double d;
    transient char c;

    public MyCl(String s, int i, double d, char c) {
        this.s = s;
        this.i = i;
        this.d = d;
        this.c = c;
    }

    public String toString() {
        return "s = " + s + "; i = " + i + "; d = " + d + "; c = " + c;
    }
}

public class SerializationDemo {
    public static void main(String[] args) {

        try (ObjectOutputStream objOStrm = new ObjectOutputStream(new FileOutputStream("serial"))) {

            MyCl object1 = new MyCl("Hello", -7, 2.7e10, 'c');
            System.out.println("object1: " + object1);

            objOStrm.writeObject(object1);

        } catch (IOException e) {
            System.out.println("Исключение при сериализации: " + e);
        }

        try (ObjectInputStream objIStrm = new ObjectInputStream(new FileInputStream("serial"))) {

            MyCl object2 = (MyCl) objIStrm.readObject();
            System.out.println("object2: " + object2);

        } catch (Exception e) {
            System.out.println("Ислкючение при десериализации: " + e);
            System.exit(0);
        }

    }
}
