package ioStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        try(FileWriter file = new FileWriter("writer.txt")){
            file.write('A');
            char[] buf = {'B','C','D','E'};

            file.write(buf);
            file.write("안녕하세요");
            file.write(buf,1,2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("End");
    }
}
