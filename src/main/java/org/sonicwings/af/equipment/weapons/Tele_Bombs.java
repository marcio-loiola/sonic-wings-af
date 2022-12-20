package org.sonicwings.af.equipment.weapons;

public class Tele_Bombs extends WeaponDecorator {

    Weapon weapon;

    public Tele_Bombs(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getDescription() {
        return weapon.getDescription();
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

    public String name() {
        return "Bombas Tele Guiadas";
    }

    @Override
    public String description() {
    return "SUPER BOMBAS TELE GUIADAS!";
    }

    @Override
    public double armorPts() {
        return 0.05;
    }

    @Override
    public double attackPts() {
        return 1.00;
    }

    @Override
    public double price() {
        return 200;
    }


}

