package objectClass.method;

public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student st1 = new Student(1001,"kim");
        Student st2 = new Student(1001,"kim");

        System.out.println(st1 == st2);
        System.out.println(st1.equals(st2));

        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());

        System.out.println(System.identityHashCode(st1));
        System.out.println(System.identityHashCode(st2));
        System.out.println(st1.toString());

        st1.setStudentName("Lee");
        Student copyStudent = (Student)st1.clone();
        System.out.println(copyStudent);



        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }
}
