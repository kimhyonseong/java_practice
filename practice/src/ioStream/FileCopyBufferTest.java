package ioStream;

import java.io.*;

public class FileCopyBufferTest {
    public static void main(String[] args) {
        long millis = 0;

        try(
                BufferedInputStream file1 = new BufferedInputStream(new FileInputStream("a.zip"));
                BufferedOutputStream file2 = new BufferedOutputStream(new FileOutputStream("copy.zip"));
                ) {
            millis = System.currentTimeMillis();

            int i;
            while ((i= file1.read()) != -1) {
                file2.write(i);
            }

            millis = System.currentTimeMillis() - millis;
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(millis);
    }
}
