package HeadFirst.strategy.game.behavior;

public class BowBehavior implements WeaponBehavior{
  @Override
  public void useWeapon() {
    System.out.println("활 공격");
  }
}
