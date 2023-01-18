package serialize;

import java.io.*;

public class SerializationTest {
    public static void main(String[] args) {
        Person person1 = new Person("이순신","대표이사");
        Person person2 = new Person("김유신","상무이사");

        try(
                FileOutputStream file = new FileOutputStream("./src/serialize/serial.txt");
                ObjectOutputStream objS = new ObjectOutputStream(file);
        ) {
            objS.writeObject(person1);
            objS.writeObject(person2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(
                FileInputStream file = new FileInputStream("./src/serialize/serial.txt");
                ObjectInputStream objS = new ObjectInputStream(file);
        ) {
            Person p1 = (Person)objS.readObject();
            Person p2 = (Person)objS.readObject();

            System.out.println(p1);
            System.out.println(p2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
