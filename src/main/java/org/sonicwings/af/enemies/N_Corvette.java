package org.sonicwings.af.enemies;

public class N_Corvette extends Enemy {
    public N_Corvette() {
        super("NavalEnemy");
        this.cod = 0;
        this.name = "N_Corvette";
        this.Health = 100.0;
        this.FirePower = 100.0;
        this.DefensePts = 100.0;
    }

    public void attack() {
        System.out.println("The enemy is attacking!");
    }
}

