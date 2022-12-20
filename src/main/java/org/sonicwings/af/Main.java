package org.sonicwings.af;

import org.sonicwings.af.enemies.*;

public class Main {
  public static void main(String[] args) {
    EnemyFactory enemyFactory = new EnemyFactory();
    enemyFactory.createEnemy("bomber");

  }
}