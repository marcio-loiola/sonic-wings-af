package org.sonicwings.af.equipment.armors;

public class ForceCampTwo extends Armor {

  public ForceCampTwo() {
    description = "Campo de força simples e básico";
  }

  @Override
  public String description() {
    return "Campo de força 4";
  }

  public double armorPts() {
    return 0.2;
  }

  public double attackPts() {
    return 0.0;
  }

  public double price() {
    return 150;
  }
}
