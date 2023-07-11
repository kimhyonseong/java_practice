package HeadFirst.strategy.game.character;

import HeadFirst.strategy.game.behavior.WeaponBehavior;

public abstract class Character {
  WeaponBehavior weapon;

  public Character() {}

  public void attack() {
    weapon.useWeapon();
  }

  public void setWeapon(WeaponBehavior weaponBehavior) {
    this.weapon = weaponBehavior;
  }
}
