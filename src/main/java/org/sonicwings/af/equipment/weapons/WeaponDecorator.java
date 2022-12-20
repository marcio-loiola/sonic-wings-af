package org.sonicwings.af.equipment.weapons;

import org.sonicwings.af.equipment.armors.ArmorDecorator;

public abstract class WeaponDecorator extends ArmorDecorator {

    public WeaponDecorator() {
        super();
    }

    public abstract String getDescription();
    public abstract double getArmorPts();

}