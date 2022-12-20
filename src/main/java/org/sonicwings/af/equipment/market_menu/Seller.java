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
    System.out.println(" DP: Defense Points -- AP: Attack Points");
    printMenu(weaponsIterator);
    System.out.println("\n ARMADURAS");
    System.out.println(" DP: Defense Points -- AP: Attack Points");
    printMenu(armorIterator);
  }

  private void printMenu(Iterator iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = (MenuItem) iterator.next();
      System.out.print(menuItem.getName() + ": ");
      System.out.print(menuItem.getDescription() + "\n");
      System.out.println(menuItem.armorPts + "DP,");
      System.out.println(menuItem.attackPts + "AP,");
      System.out.println(menuItem.getPrice() + "R$");
    }
  }


}
