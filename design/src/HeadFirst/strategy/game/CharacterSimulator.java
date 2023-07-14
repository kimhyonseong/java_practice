package HeadFirst.strategy.game;

import HeadFirst.strategy.game.behavior.AxeBehavior;
import HeadFirst.strategy.game.behavior.BowBehavior;
import HeadFirst.strategy.game.character.King;

public class CharacterSimulator {
  public static void main(String[] args) {
    King king = new King();
    king.attack();
    king.setWeapon(new AxeBehavior());
    king.attack();
    king.setWeapon(new BowBehavior());
    king.attack();
  }
}
