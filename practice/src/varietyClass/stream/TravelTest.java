package varietyClass.stream;

import java.util.ArrayList;
import java.util.Arrays;

public class TravelTest {
    public static void main(String[] args) {
        TravelCustomer tc1 = new TravelCustomer("이순신",40,100);
        TravelCustomer tc2 = new TravelCustomer("김유신",20,100);
        TravelCustomer tc3 = new TravelCustomer("홍길동",13,50);

        ArrayList<TravelCustomer> array = new ArrayList<>();
        array.add(tc1);
        array.add(tc2);
        array.add(tc3);

        array.stream().map(s->s.getName()).forEach(n-> System.out.println(n));
        System.out.println();
        System.out.println(array.stream().mapToInt(s->s.getPrice()).sum());
        System.out.println();
        array.stream().filter(n->n.getAge()>=20).map(c->c.getName()).sorted().forEach(s-> System.out.println(s));
        System.out.println();
    }
}
