package varietyClass.stream.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<>();
        sList.add("Tomas");
        sList.add("나");
        sList.add("너");
        sList.add("Jane");

        Stream<String> stream = sList.stream();
        stream.forEach(n-> System.out.println(n));
        System.out.println();

        sList.stream().sorted().forEach(n-> System.out.print(n+"\t"));
        System.out.println();
        sList.stream().map(s->s.length()).forEach(n-> System.out.print(n+"\t"));
        System.out.println();
        sList.stream().filter(s->s.length()>=5).forEach(n-> System.out.println(n));
    }
}
