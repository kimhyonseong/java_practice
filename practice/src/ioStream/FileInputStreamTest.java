package ioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {
        FileInputStream file = null;
        try {
            file = new FileInputStream("input.txt");
            System.out.println((char)file.read());
            System.out.println((char)file.read());
            System.out.println((char)file.read());
        } catch (IOException e) {
            e.printStackTrace();

            try {
                file.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            } catch (Exception e1) {
                System.out.println(e1);
            }
        } finally {
            try {
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e1) {
                System.out.println(e1);
            }
        }

        System.out.println("End");
    }
}
