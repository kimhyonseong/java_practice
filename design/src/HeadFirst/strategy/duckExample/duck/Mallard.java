package HeadFirst.strategy.duckExample.duck;

import HeadFirst.strategy.duckExample.behavior.FlyWithWings;
import HeadFirst.strategy.duckExample.behavior.Quack;

public class Mallard extends Duck{
  public Mallard() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  @Override
  public void display() {

  }
}
