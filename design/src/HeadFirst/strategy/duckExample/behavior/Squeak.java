package HeadFirst.strategy.duckExample.behavior;

public class Squeak implements QuackBehavior{
  @Override
  public void quack() {
    System.out.println("삑");
  }
}
