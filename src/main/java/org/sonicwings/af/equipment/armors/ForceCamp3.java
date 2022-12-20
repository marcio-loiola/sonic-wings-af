package org.sonicwings.af.equipment.armors;

public class ForceCamp3 extends ArmorDecorator {
    Armor armor;

    public ForceCamp3(Armor armor) {
        this.armor = armor;
    }

    public String getDescription() {
        return armor.getDescription() + ", Campo de força 3 com +5% de força de ataque";
    }

    public double getArmorPts() {
        return armor.getArmorPts() + 0.3;
    }

    public double getAttackPts() {
        return armor.getAttackPts() + 0.05;
    }

    public double getPrice() {
        return armor.getPrice() + 200;
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

