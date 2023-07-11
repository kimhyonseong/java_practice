package HeadFirst.strategy.duckExample.duck;

import HeadFirst.strategy.duckExample.behavior.FlyNoWay;
import HeadFirst.strategy.duckExample.behavior.Quack;
import HeadFirst.strategy.duckExample.duck.Duck;

public class ModelDuck extends Duck {
  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("모형 오리");
  }
}
