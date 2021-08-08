package com.melnykvl.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFileWithResources {
    public static void main(String[] args) {

        int i;
        String fileName = "JavaCore.iml";

        try (FileInputStream fin = new FileInputStream(fileName)) {

            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            }while (i != -1);

        } catch (FileNotFoundException e) {
            System.out.println("File not fount");
        } catch (IOException e) {
            System.out.println("Error i/o");
        }

    }
}
