package ioStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStreamTest1 {
    public static void main(String[] args) {
        try(FileOutputStream file = new FileOutputStream("output.txt")) {
            file.write(65);
            file.write(66);
            file.write(67);
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("End");
    }
}
