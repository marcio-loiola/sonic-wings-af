package org.sonicwings.af.enemies;

public class T_Artillery extends Enemy {
    public T_Artillery() {
        super("EarthEnemy");
        this.cod = 1;
        this.name = "T_Artillery";
        this.Health = 100.0;
        this.FirePower = 100.0;
        this.DefensePts = 100.0;
    }

    public void attack() {
        System.out.println("The enemy is attacking!");
    }
}

