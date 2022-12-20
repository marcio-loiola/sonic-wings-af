package org.sonicwings.af.equipment.market_menu;

public class MenuTestDrive {
  public static void main(String[] args) {
    WeaponsMenu weaponsMenu = new WeaponsMenu();
    ArmorsMenu armorsMenuMenu = new ArmorsMenu();

    Seller seller = new Seller(weaponsMenu, armorsMenuMenu);
    seller.printMenu();

  }
}

