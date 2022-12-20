package org.sonicwings.af.missions;

import org.sonicwings.af.enemies.Enemy;
import org.sonicwings.af.enemies.EnemyFactory;

public class BattleCamp {
  public int cod;
  public String name;
  public String description;
  public String dificulty;
  public String prize;

  public Enemy enemy;

  public void addEnemy(String type) {
    EnemyFactory enemyFactory = new EnemyFactory();
    enemy = enemyFactory.createEnemy(type);
  }

  public void removeEnemy(Enemy enemy) {
    this.enemy = null;
  }

  public Object getEnemy() {
    if (enemy != null) {
      System.out.println("Enemy: " + enemy.type);
      return enemy;
    } else {
      System.out.println("No enemy in the camp!");
      return 0;
    }
  }


  public BattleCamp(String name, String description, String type, int cod) {
    this.name = name;
    this.description = description;
    this.dificulty = dificulty;
    this.prize = prize;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public String getDificulty() {
    return dificulty;
  }

}
