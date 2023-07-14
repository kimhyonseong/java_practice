package HeadFirst.strategy.game.character;

import HeadFirst.strategy.game.behavior.WeaponBehavior;

public abstract class Character {
  WeaponBehavior weapon;

  public Character() {}

  public void attack() {
    if (this.weapon == null) System.out.println("무기가 없습니다.");
    else {
      weapon.useWeapon();
    }
  }

  public void setWeapon(WeaponBehavior weaponBehavior) {
    if (this.weapon == null) System.out.println("무기를 선택하였습니다.");
    else System.out.println("무기를 교체하였습니다.");
    this.weapon = weaponBehavior;
  }
}
