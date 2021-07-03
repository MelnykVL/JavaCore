package main.java.com.melnykvl.javacore.chapter20;

import java.io.File;

public class FileDemo {

    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {

        File f1 = new File("NewJavaCore.txt");
        p("Имя файла: " + f1.getName());
        p("Путь: " + f1.getPath());
        p("Абсолютный путь: " + f1.getAbsolutePath());

        p(f1.exists() ? "существует" : "не существует");
        p(f1.canWrite() ? "доступен для записи" : "недоступен для записи");
        p(f1.canRead() ? "доступен для чтения" : "недоступен для чтения");
        p(f1.isDirectory() ? "являеться каталогом" : "не являеться каталогом");
        p(f1.isFile() ? "являеться обычным файлом" : "не являеться обычным файлом");
        p(f1.isAbsolute() ? "являеться абсолютным" : "не являеться абсолютным");

        p("Последнее изменение в файле: " + f1.lastModified());
        p("Размер: " + f1.length() + " байт");

    }
}
