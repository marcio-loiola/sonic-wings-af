package org.sonicwings.af.equipment.market_menu;

public class Seller {
  WeaponsMenu weaponsMenu;
  ArmorsMenu armorMenu;

  public Seller (WeaponsMenu weaponsMenu, ArmorsMenu armorMenu) {
    this.weaponsMenu = weaponsMenu;
    this.armorMenu = armorMenu;
  }

  public void printMenu() {
    Iterator weaponsIterator = weaponsMenu.createIterator();
    Iterator armorIterator = armorMenu.createIterator();
    System.out.println("MENU\n----\n ARMAS");
    printMenu(weaponsIterator);
    System.out.println("\n ARMADURAS");
    printMenu(armorIterator);
  }

  private void printMenu(Iterator iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = (MenuItem) iterator.next();
      System.out.print(menuItem.getName() + ", ");
      System.out.print(menuItem.getDescription() + " -- ");
      System.out.println(menuItem.armorPts + " -- ");
      System.out.println(menuItem.attackPts + " -- ");
      System.out.println(menuItem.getPrice());
    }
  }


}
