package HeadFirst.strategy.game.character;

import HeadFirst.strategy.game.behavior.SwordBehavior;

public class Queen extends Character {
  public Queen() {
    weapon = new SwordBehavior();
  }
}
