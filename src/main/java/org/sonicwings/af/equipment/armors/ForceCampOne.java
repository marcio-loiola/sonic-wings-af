package org.sonicwings.af.equipment.armors;

public class ForceCampOne extends Armor {

  public ForceCampOne() {
    description = "Campo de força simples e básico";
  }

  public double armorPts() {
    return 0.1;
  }

  public double attackPts() {
    return 0.0;
  }

  public double price() {
    return 100;
  }
}
