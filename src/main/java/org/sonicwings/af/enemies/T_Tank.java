package org.sonicwings.af.enemies;

public class T_Tank extends Enemy {
    public T_Tank(String type) {
        super(type);
        this.cod = 0;
        this.name = "T_Tank";
        this.Health = 100.0;
        this.FirePower = 100.0;
        this.DefensePts = 100.0;
    }

    public void attack() {
        System.out.println("The enemy is attacking!");
    }
}

