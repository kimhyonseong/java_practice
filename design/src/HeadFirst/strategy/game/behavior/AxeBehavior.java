package HeadFirst.strategy.game.behavior;

public class AxeBehavior implements WeaponBehavior{
  @Override
  public void useWeapon() {
    System.out.println("도끼 공격");
  }
}
