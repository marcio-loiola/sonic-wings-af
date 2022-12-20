package org.sonicwings.af.enemies;

public class A_Finder extends Enemy {

    public A_Finder() {
        super("PlaneEnemy");
        this.cod = 3;
        this.name = "A_Searcher";
        this.Health = 50.0;
        this.FirePower = 50.0;
        this.ArmorPts = 50.0;
    }

    public void attack() {
        System.out.println("The enemy is attacking!");
    }
}
