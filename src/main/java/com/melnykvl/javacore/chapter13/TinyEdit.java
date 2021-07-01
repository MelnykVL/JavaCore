package main.java.com.melnykvl.javacore.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEdit {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[100];

        System.out.println("Enter text.");
        System.out.println("Enter 'stop' to complete.");
        for (int i = 0; i < str.length; i++) {
            str[i] = br.readLine();
            if (str[i].equals("stop")) break;
        }

        System.out.println("\nContent of your file:");
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("stop")) break;
            System.out.println(str[i]);
        }

    }
}
