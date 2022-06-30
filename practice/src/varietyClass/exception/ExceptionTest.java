package varietyClass.exception;

public class ExceptionTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        try {
            for (int i =0; i<=5; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }

        System.out.println("End...");

        //finally 역할 - 사용중인 리소스 종료
    }
}
