package HeadFirst.proxy.dating;

import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {
  public static void main(String[] args) {
    MatchMakingTestDrive test = new MatchMakingTestDrive();
    test.drive();
  }

  public MatchMakingTestDrive() {

  }

  public void drive() {

  }

  Person getOwnerProxy(Person person) {
    return (Person) Proxy.newProxyInstance(
            person.getClass().getClassLoader(),
            person.getClass().getInterfaces(),
            new OwnerInvocationHandler(person));
  }
}
