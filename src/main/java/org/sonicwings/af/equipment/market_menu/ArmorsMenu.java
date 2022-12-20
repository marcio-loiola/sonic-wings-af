package org.sonicwings.af.equipment.market_menu;

import org.sonicwings.af.equipment.armors.*;

public class ArmorsMenu {
  static final int MAX_ITEMS = 6;
  int numberOfItems = 0;
  MenuItem[] menuItems;

  public ArmorsMenu() {
    menuItems = new MenuItem[MAX_ITEMS];
    Armor localArmor = new Armor() {
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

    ForceCampOne forceCampOne = new ForceCampOne();
    ForceCampTwo forceCampTwo = new ForceCampTwo();
    ForceCamp3 forceCamp3 = new ForceCamp3(localArmor);
    ForceCamp4 forceCamp4 = new ForceCamp4(localArmor);
    ForceCamp5 forceCamp5 = new ForceCamp5(localArmor);

    addItem(forceCampOne.getName(), forceCampOne.description(), forceCampOne.armorPts(), forceCampOne.attackPts(), forceCampOne.price());
    addItem(forceCampOne.getName(), forceCampTwo.description(), forceCampTwo.armorPts(), forceCampTwo.attackPts(), forceCampTwo.price());
    addItem(forceCampOne.getName(), forceCamp3.description(), forceCamp3.armorPts(), forceCamp3.attackPts(), forceCamp3.price());
    addItem(forceCampOne.getName(), forceCamp4.description(), forceCamp4.armorPts(), forceCamp4.attackPts(), forceCamp4.price());
    addItem(forceCampOne.getName(), forceCamp5.description(), forceCamp5.armorPts(), forceCamp5.attackPts(), forceCamp5.price());
  }

  public void addItem(String name, String description, double armorPts, double attackPts, double price) {
    MenuItem menuItem = new MenuItem(name, description, armorPts, attackPts, price);

    if (numberOfItems >= MAX_ITEMS) {
      System.err.println("O menu está cheio! Não é possível adicionar mais itens.");
    } else {
      menuItems[numberOfItems] = menuItem;
      numberOfItems = numberOfItems + 1;
    }
  }

  public Iterator createIterator() {
    return new ArmorsMenuIterator(menuItems);
  }

}

