/*
package org.sonicwings.af.equipment.market_menu;

public class EquipmentMenuIterator implements Iterator {
    Equipment[] equipment;
    int position = 0;

    public EquipmentMenuIterator(Equipment[] equipment) {
        this.equipment = equipment;
    }

    public Object next() {
        Equipment equipment = this.equipment[position];
        position = position + 1;
        return equipment;
    }

    public boolean hasNext() {
        if (position >= equipment.length || equipment[position] == null) {
            return false;
        } else {
            return true;
        }
    }
}

*/
