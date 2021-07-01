package main.java.com.melnykvl.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {

        String firstFile = "JavaCore.iml", secondFile = "NewJavaCore.txt";
        int i;


        try (FileInputStream fin = new FileInputStream(firstFile);
             FileOutputStream fout = new FileOutputStream(secondFile);) {

            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);

        } catch (IOException e) {
            System.out.println("Error i/o: " + e);
        }

    }
}
