package ioStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStreamTest2 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream file = new FileOutputStream("output2.txt",true);
        try(file) {
            byte[] bs = new byte[26];

            byte data=65;
            for (int i=0; i<bs.length; i++) {
                bs[i] = data++;
            }
            file.write(bs,2,10);

        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("End");
    }
}
