package HeadFirst.strategy.game.behavior;

public class SwordBehavior implements WeaponBehavior{
  @Override
  public void useWeapon() {
    System.out.println("검 공격");
  }
}
