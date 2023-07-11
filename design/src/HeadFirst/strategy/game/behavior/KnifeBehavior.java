package HeadFirst.strategy.game.behavior;

public class KnifeBehavior implements WeaponBehavior{
  @Override
  public void useWeapon() {
    System.out.println("단검 공격");
  }
}
