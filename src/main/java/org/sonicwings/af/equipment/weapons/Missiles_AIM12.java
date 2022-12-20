package org.sonicwings.af.equipment.weapons;

public class Missiles_AIM12 extends Weapon {

  public String description() {
    return "Mísseis AIM-120";
  }

  @Override
  public double armorPts() {
    return 0;
  }

  @Override
  public double attackPts() {
    return 0.045;
  }

  @Override
  public double price() {
    return 150;
  }




}
