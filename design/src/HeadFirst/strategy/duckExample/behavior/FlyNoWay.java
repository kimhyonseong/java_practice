package HeadFirst.strategy.duckExample.behavior;

public class FlyNoWay implements FlyBehavior{
  @Override
  public void fly() {
    System.out.println("못 남");
  }
}
