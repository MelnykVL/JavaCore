package com.melnykvl.javacore.chapter20;

import java.io.File;

public class DirList {
    public static void main(String[] args) {

        String dirName = "src/main/java/com/melnykvl/javacore/chapter20";
        File f1 = new File(dirName);

        if (f1.isDirectory()) {
            System.out.println("Каталог " + dirName);
            String[] s = f1.list();

            for (int i = 0; i < s.length; i++) {
                File f = new File(dirName + "/" + s[i]);

                if (f.isDirectory())
                    System.out.println(s[i] + " являеться каталогом");
                else
                    System.out.println(s[i] + " являеться файлом");
            }
        } else {
            System.out.println(dirName + " не являеться каталогом");
        }

    }
}
