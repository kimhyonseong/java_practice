package varietyClass.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionTest {
    public static void main(String[] args) {

        // AutoCloseable 인터페이스를 사용하는 객체들은 자동으로 리소스를 종료함
        try (FileInputStream file = new FileInputStream("a.txt")){
            System.out.println("READ");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("End");

        AutoCloseableObj obj = new AutoCloseableObj();
        try(obj) {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Exception");
        }

        System.out.println("end 2");
    }
}
