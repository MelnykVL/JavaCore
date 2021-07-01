package main.java.com.melnykvl.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {

        int i;
        FileInputStream fin;
        String fileName = "JavaCore.iml";

        try {
            fin = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open file");
            return;
        }

        try {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Error reading from file");
        } finally {
            try {
                fin.close();
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }

    }
}
