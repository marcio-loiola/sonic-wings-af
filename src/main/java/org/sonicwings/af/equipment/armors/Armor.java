package org.sonicwings.af.equipment.armors;

public abstract class Armor {
  int cod;
  public String name;
  public String description;
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



  public abstract String description();

  public abstract double armorPts();

  public abstract double attackPts();

  public abstract double price();

}



