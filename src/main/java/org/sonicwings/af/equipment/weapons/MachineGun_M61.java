package org.sonicwings.af.equipment.weapons;

public class MachineGun_M61 extends Weapon {

  public String description() {
    return "M61 Vulcan";
  }

  @Override
  public double armorPts() {
    return 0;
  }

  @Override
  public double attackPts() {
    return 0.035;
  }

  @Override
  public double price() {
    return 100;
  }



}
