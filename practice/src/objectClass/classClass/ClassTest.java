package objectClass.classClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class c1 = Class.forName("objectClass.classClass.Person");

        Person person = (Person) c1.newInstance();

        person.setName("Lee");
        person.setAge(10);
        System.out.println(person);

        Class c2 = person.getClass();
        Person p = (Person) c2.newInstance();
        System.out.println(p);

        Class[] parameter = {String.class,int.class};
        Constructor cons = c2.getConstructor(parameter);

        Object[] initargs = {"Kim",20};
        Person kim = (Person)cons.newInstance(initargs);
        System.out.println(kim);
    }
}
