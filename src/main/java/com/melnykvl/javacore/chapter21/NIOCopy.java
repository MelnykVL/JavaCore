package main.java.com.melnykvl.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;

public class NIOCopy {
    public static void main(String[] args) {

        String from = "test.txt";
        String to = "test_copy.txt";

        try {

            Path source = Paths.get(from);
            Path target = Paths.get(to);

            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }

    }
}
