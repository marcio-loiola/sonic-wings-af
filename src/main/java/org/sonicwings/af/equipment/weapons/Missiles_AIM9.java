package org.sonicwings.af.equipment.weapons;

public class Missiles_AIM9 extends WeaponDecorator {

  Weapon weapon;

  public Missiles_AIM9(Weapon weapon) {
    this.weapon = weapon;
  }

  public String getDescription() {
    return weapon.getDescription() + ", MÍSSEIS DEFENSIVOS AIM-9!";
  }

  public double getArmorPts() {
    return weapon.getArmorPts() + 0.05;
  }

  public double getAttackPts() {
    return weapon.getAttackPts() + 1.0;
  }

  public double getPrice() {
    return weapon.getPrice() + 500;
  }

  @Override
  public double armorPts() {
    return 0;
  }

  @Override
  public double attackPts() {
    return 0;
  }

  @Override
  public double price() {
    return 0;
  }

}
