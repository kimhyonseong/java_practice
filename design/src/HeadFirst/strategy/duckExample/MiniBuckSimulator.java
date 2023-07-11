package HeadFirst.strategy.duckExample;

import HeadFirst.strategy.duckExample.behavior.FlyRocketPowered;
import HeadFirst.strategy.duckExample.duck.Duck;
import HeadFirst.strategy.duckExample.duck.Mallard;
import HeadFirst.strategy.duckExample.duck.ModelDuck;

public class MiniBuckSimulator {
  public static void main(String[] args) {
    Duck mallard = new Mallard();
    mallard.performFly();
    mallard.performQuack();

    Duck modelDuck = new ModelDuck();
    modelDuck.performFly();
    modelDuck.setFlyBehavior(new FlyRocketPowered());
    modelDuck.performFly();
  }
}
