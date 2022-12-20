package org.sonicwings.af.enemies;

public class C_Building extends Enemy {
    public C_Building() {
        super("BuildingEnemy");
        this.cod = 0;
        this.name = "C_Building";
        this.Health = 100.0;
        this.FirePower = 100.0;
        this.DefensePts = 100.0;
    }

    public void attack() {
        System.out.println("The enemy is attacking!");
    }
}

