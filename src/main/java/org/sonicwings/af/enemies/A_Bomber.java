package org.sonicwings.af.enemies;

public class A_Bomber extends Enemy {

    public A_Bomber(String type) {
        super(type);
    }

  public void attack() {
    System.out.println("The enemy is attacking!");
  }
}

