package objectClass.stringClass;

public class StringTest {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");

        // 메모리가 계속 생성되서 안좋음
        System.out.println(System.identityHashCode(java));
        java = java.concat(android);
        System.out.println(System.identityHashCode(java));
    }
}
