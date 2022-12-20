package org.sonicwings.af.enemies;

public class A_Hunter extends Enemy {

  public A_Hunter() {
    super("PlaneEnemy");
    this.cod = 2;
    this.name = "A_Hunter";
    this.Health = 200.0;
    this.FirePower = 150.0;
    this.ArmorPts = 120.0;
  }

  public void attack() {
    System.out.println("The enemy is attacking!");
  }
}

