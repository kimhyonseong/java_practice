package HeadFirst.strategy.duckExample.behavior;

public class FlyWithWings implements FlyBehavior{
  @Override
  public void fly() {
    System.out.println("나는 중");
  }
}
