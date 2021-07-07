package main.java.com.melnykvl.javacore.chapter21;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MappedChannelRead2 {
    public static void main(String[] args) {

        FileInputStream fin = null;
        FileChannel fChan = null;
        long fSize;
        MappedByteBuffer mBuf;

        try {

            fin = new FileInputStream("test.txt");

            fChan = fin.getChannel();

            fSize = fChan.size();

            mBuf = fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);

            for (int i = 0; i < fSize; i++)
                System.out.print((char) mBuf.get());

        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        } finally {

            try {
                if (fChan != null) fChan.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия канала.");
            }

            try {
                if (fin != null) fin.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла.");
            }

        }

    }
}
