package ioStream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        try(FileReader file = new FileReader("reader.txt")){
            int i;

            while((i=file.read()) != -1) {
                System.out.print((char)i);
            }
        } catch (IOException e) {

        }
    }
}
