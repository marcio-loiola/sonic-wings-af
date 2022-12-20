package org.sonicwings.af.equipment.weapons;

public class Bombs extends WeaponDecorator {

  Weapon weapon;

  public Bombs(Weapon weapon) {
    this.weapon = weapon;
  }

  public String getDescription() {
    return weapon.getDescription() + ", SUPER BOMBAS de 100 libras!";
  }

  public double getArmorPts() {
    return weapon.getArmorPts() + 0.05;
  }

  public double getAttackPts() {
    return weapon.getAttackPts() + 0.75;
  }

  public double getPrice() {
    return weapon.getPrice() + 400;
  }

  @Override
  public String description() {
    return "";
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
