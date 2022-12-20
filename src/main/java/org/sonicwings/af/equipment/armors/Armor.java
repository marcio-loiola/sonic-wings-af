package org.sonicwings.af.equipment.armors;

public abstract class Armor {
  int cod;
  String name;
  String description = "Armadura";
  double attackPts;
  double armorPts;
  double price;

  public int getCod() {
    return cod;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public double getArmorPts() {
    return armorPts;
  }

  public double getAttackPts() {
    return attackPts;
  }

  public double getPrice() {
    return price;
  }

  public abstract double armorPts();

  public abstract double attackPts();

  public abstract double price();

}



