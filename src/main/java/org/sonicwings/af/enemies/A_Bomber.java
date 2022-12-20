package org.sonicwings.af.enemies;

public class A_Bomber extends Enemy {

    public A_Bomber() {
        super("PlaneEnemy");
        this.cod = 1;
        this.name = "A_Bomber";
        this.Health = 100.0;
        this.FirePower = 100.0;
        this.ArmorPts = 100.0;
    }


  public void attack() {
    System.out.println("The enemy is attacking!");
  }
}

