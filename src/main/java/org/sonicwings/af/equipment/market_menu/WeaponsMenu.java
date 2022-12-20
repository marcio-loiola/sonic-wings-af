package org.sonicwings.af.equipment.market_menu;

import org.sonicwings.af.equipment.weapons.*;
import java.util.ArrayList;

public class WeaponsMenu {
  ArrayList menuItems;

  public WeaponsMenu() {
    menuItems = new ArrayList();
    Weapon localWeapon = new Weapon() {
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
    MachineGun_M61 machineGun_M61 = new MachineGun_M61();
    Missiles_AIM9 missles_AIM9 = new Missiles_AIM9(localWeapon);
    Missiles_AIM12 missles_AIM120 = new Missiles_AIM12();
    Bombs bombs = new Bombs(localWeapon);
    Tele_Bombs tele_bombs = new Tele_Bombs(localWeapon);

    addItem(machineGun_50.getName(), machineGun_50.getDescription(), machineGun_50.armorPts(), machineGun_50.attackPts(), machineGun_50.price());
    addItem(machineGun_M61.getName(), machineGun_M61.getDescription(), machineGun_M61.armorPts(), machineGun_M61.attackPts(), machineGun_M61.price());
    addItem(missles_AIM9.getName(), missles_AIM9.getDescription(), missles_AIM9.armorPts(), missles_AIM9.attackPts(), missles_AIM9.price());
    addItem(missles_AIM120.getName(), missles_AIM120.getDescription(), missles_AIM120.armorPts(), missles_AIM120.attackPts(), missles_AIM120.price());
    addItem(bombs.getName(), bombs.getDescription(), bombs.armorPts(), bombs.attackPts(), bombs.price());
    addItem(tele_bombs.getName(), tele_bombs.getDescription(), tele_bombs.armorPts(), tele_bombs.attackPts(), tele_bombs.price());

  }

  public void addItem(String name, String description, double armorPts, double attackPts,  double price) {
    MenuItem menuItem = new MenuItem(name, description, armorPts, attackPts, price);
    menuItems.add(menuItem);
  }

  public ArrayList getMenuItems() {
    return menuItems;
  }


}
