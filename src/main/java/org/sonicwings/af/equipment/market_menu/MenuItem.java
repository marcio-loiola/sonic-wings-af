package org.sonicwings.af.equipment.market_menu;

public class MenuItem {
  String name;
  String description;

  double attackPts;
  double armorPts;
  double price;


  public MenuItem(String name, String description, double armorPts, double attackPts,  double price) {
    this.name = name;
    this.description = description;
    this.attackPts = attackPts;
    this.armorPts = armorPts;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }

}
