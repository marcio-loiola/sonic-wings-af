package org.sonicwings.af.enemies;

public class C_Barracks extends Enemy {
    public C_Barracks() {
        super("BuildingEnemy");
        this.cod = 1;
        this.name = "C_Building";
        this.Health = 200.0;
        this.FirePower = 150.0;
        this.DefensePts = 200.0;
    }

    public void attack() {
        System.out.println("The enemy is attacking!");
    }
}

