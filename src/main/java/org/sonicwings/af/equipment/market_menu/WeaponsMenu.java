package org.sonicwings.af.equipment.market_menu;

import org.sonicwings.af.equipment.weapons.*;
import java.util.ArrayList;

public class WeaponsMenu {
  ArrayList menuItems;

  public WeaponsMenu() {
    menuItems = new ArrayList();
    Weapon localWeapon = new Weapon() {

      @Override
      public String description() {
        return "";
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
    };

    MachineGun_50 machineGun_50 = new MachineGun_50();
    Missiles_AIM9 missles_AIM9 = new Missiles_AIM9(localWeapon);
    Tele_Bombs tele_bombs = new Tele_Bombs(localWeapon);

    addItem(machineGun_50.name(), machineGun_50.description(), machineGun_50.armorPts(), machineGun_50.attackPts(), machineGun_50.price());
    addItem(missles_AIM9.name(), missles_AIM9.description(), missles_AIM9.armorPts(), missles_AIM9.attackPts(), missles_AIM9.price());
    addItem(tele_bombs.name(), tele_bombs.description(), tele_bombs.armorPts(), tele_bombs.attackPts(), tele_bombs.price());

  }

  public void addItem(String name, String description, double armorPts, double attackPts,  double price) {
    MenuItem menuItem = new MenuItem(name, description, armorPts, attackPts, price);
    menuItems.add(menuItem);
  }

  public Iterator createIterator() {
    return new WeaponsMenuIterator(menuItems);
  }

}
