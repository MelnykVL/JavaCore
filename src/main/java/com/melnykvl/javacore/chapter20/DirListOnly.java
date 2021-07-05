package main.java.com.melnykvl.javacore.chapter20;

import java.io.File;
import java.io.FilenameFilter;

public class DirListOnly {
    public static void main(String[] args) {

        String dirName = "src/main/java/com/melnykvl/javacore/chapter20";
        File f1 = new File(dirName);
        FilenameFilter only = new OnlyExt("java");
        String[] s = f1.list(only);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

    }
}
