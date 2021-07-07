package main.java.com.melnykvl.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class MyFileVisitor extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path path, BasicFileAttributes attribs) throws IOException {
        System.out.println(path);
        return  FileVisitResult.CONTINUE;
    }
}

public class DirTreeList {
    public static void main(String[] args) {

        String dirname = "src";

        System.out.println("Дерево каталогов, начиная с каталога " + dirname + ":\n");

        try {
            Files.walkFileTree(Paths.get(dirname), new MyFileVisitor());
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода");
        }

    }
}
