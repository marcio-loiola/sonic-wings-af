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

  public String name() {
    return "Mísseis AIM-9";
  }

  @Override
  public String description() {
    return "Mísseis defensivos AIM-9!";
  }

  @Override
  public double armorPts() {
    return 0.2;
  }

  @Override
  public double attackPts() {
    return 0.40;
  }

  @Override
  public double price() {
    return 100;
  }

}
