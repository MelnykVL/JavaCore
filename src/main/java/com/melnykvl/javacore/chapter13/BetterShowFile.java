package main.java.com.melnykvl.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BetterShowFile {
    public static void main(String[] args) {

        int i;
        FileInputStream fin = null;
        String fileName = "JavaCore.iml";


            try {

                fin = new FileInputStream(fileName);

                do {
                    i = fin.read();
                    if (i != -1) System.out.print((char) i);
                } while (i != -1);

            } catch (IOException e) {
                System.out.println("Error i/o: " + e);
            } finally {
                try {
                    if (fin != null) fin.close();
                } catch (IOException e) {
                    System.out.println("Error closing file");
                }
            }

    }
}
