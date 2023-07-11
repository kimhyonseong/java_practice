package HeadFirst.strategy.game.character;

import HeadFirst.strategy.game.behavior.BowBehavior;

public class Knight extends Character{
  public Knight() {
    weapon = new BowBehavior();
  }
}
