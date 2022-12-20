package org.sonicwings.af.equipment.weapons;

public class MachineGun_50 extends Weapon {

  public String name() {
    return "M2 Browning";
  }

  @Override
  public String description() {
    return "Metralhadora de calibre 50";
  }

  @Override
  public double armorPts() {
    return 0;
  }

  @Override
  public double attackPts() {
    return 0.31;
  }

  @Override
  public double price() {
    return 50;
  }

}
