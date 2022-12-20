package org.sonicwings.af.equipment;

public class ForceCamp4 extends ArmorDecorator {
  Armor armor;

  public ForceCamp4(Armor armor) {
    this.armor = armor;
  }

  public String getDescription() {
    return armor.getDescription() + ", Campo de força 4";
  }

  public double getArmorPts() {
    return armor.getArmorPts() + 0.4;
  }

  public double getAttackPts() {
    return armor.getAttackPts();
  }

  public double getPrice() {
    return armor.getPrice() + 200;
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

