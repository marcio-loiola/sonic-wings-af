package org.sonicwings.af.enemies;

public class A_Carrier extends Enemy {

  public A_Carrier() {
    super("PlaneEnemy");
    this.cod = 3;
    this.name = "A_Carrier";
    this.Health = 300.0;
    this.FirePower = 200.0;
    this.DefensePts = 200.0;
  }

  public void attack() {
    System.out.println("The enemy is attacking!");
  }
}

