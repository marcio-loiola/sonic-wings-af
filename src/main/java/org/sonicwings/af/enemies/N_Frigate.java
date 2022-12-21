package org.sonicwings.af.enemies;

public class N_Frigate extends Enemy {
    public N_Frigate(String type) {
        super(type);
        this.cod = 1;
        this.name = "N_Frigate";
        this.Health = 200.0;
        this.FirePower = 150.0;
        this.DefensePts = 120.0;
    }

    public void attack() {
        System.out.println("The enemy is attacking!");
    }
}

