package org.sonicwings.af.equipment.weapons;

public class Tele_Bombs extends WeaponDecorator {

    Weapon weapon;

    public Tele_Bombs(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getDescription() {
        return weapon.getDescription() + ", SUPER BOMBAS TELE GUIADAS!";
    }

    public double getArmorPts() {
        return weapon.getArmorPts() + 0.05;
    }

    public double getAttackPts() {
        return weapon.getAttackPts() + 1.0;
    }

    public double getPrice() {
        return weapon.getPrice() + 500;
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


}

