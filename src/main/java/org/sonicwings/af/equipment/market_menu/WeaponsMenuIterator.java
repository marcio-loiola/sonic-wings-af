package org.sonicwings.af.equipment.market_menu;

import java.util.ArrayList;

public class WeaponsMenuIterator implements Iterator {
    MenuItem[] menuItems;

    int position = 0;

    public WeaponsMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    public Object next() {
        MenuItem menuItem = this.menuItems[position];
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }
}
