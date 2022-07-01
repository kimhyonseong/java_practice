package serialize;

import java.io.Serializable;

//Serializable - 마크인터페이스(이 객체는 직렬화이라고 알려줌)
public class Person implements Serializable {
    //transient - 이 멤버는 직렬화 하지 않음, 출력할땐 디폴트 값
    private String name;
    private String job;

    public Person(){}

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
