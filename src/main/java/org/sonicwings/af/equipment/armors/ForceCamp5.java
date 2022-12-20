package org.sonicwings.af.equipment.armors;

public class ForceCamp5 extends ArmorDecorator {
  Armor armor;

  public ForceCamp5(Armor armor) {
    this.armor = armor;
  }


  public String getDescription() {
    return armor.getDescription() + ", Campo de força 5 com +10% de força de ataque";
  }
  public double getArmorPts() {
    return armor.getArmorPts() + 0.5;
  }

  public double getAttackPts() {
    return armor.getAttackPts() + 0.10;
  }

  public double getPrice() {
    return armor.getPrice() + 400;
  }

  public String name() {
    return "Campo de força 5";
  }

  public String description() {
    return "Blindagem - 50%";
  }

  @Override
  public double armorPts() {
    return 0.5;
  }

  @Override
  public double attackPts() {
    return 0.1;
  }

  @Override
  public double price() {
    return 300;
  }
}

