package HeadFirst.strategy.duckExample.behavior;

public class Quack implements QuackBehavior{
  @Override
  public void quack() {
    System.out.println("꽥");
  }
}
