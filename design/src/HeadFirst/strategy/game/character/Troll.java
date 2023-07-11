package HeadFirst.strategy.game.character;

import HeadFirst.strategy.game.behavior.AxeBehavior;

public class Troll extends Character{
  public Troll() {
    weapon = new AxeBehavior();
  }
}
