package varietyClass.rambdaExpression;

public class StringConcatTest {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        StringConcatImpl stringImpl = new StringConcatImpl();
        stringImpl.makeString(s1,s2);

        StringConcat concat = (s,v) -> System.out.println(s+"..."+v);
        concat.makeString(s1,s2);

        // 이런식으로 만들어짐
        StringConcat concat1 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1+"___"+s2);
            }
        };
        concat1.makeString(s1,s2);
    }
}
