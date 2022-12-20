package org.sonicwings.af.equipment.market_menu;

import java.util.ArrayList;

public class WeaponsMenuIterator implements Iterator {
    ArrayList menuItems;

    int position = 0;

    public WeaponsMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    public Object next() {
        MenuItem menuItem = (MenuItem) menuItems.get(position);
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= menuItems.size() || menuItems.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

}


