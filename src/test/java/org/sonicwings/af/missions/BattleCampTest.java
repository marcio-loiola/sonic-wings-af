package org.sonicwings.af.missions;

import org.junit.Before;
import org.junit.Test;
import org.sonicwings.af.enemies.Enemy;
import org.sonicwings.af.enemies.EnemyFactory;

import static org.junit.Assert.*;

public class BattleCampTest {

  Enemy enemy;
  EnemyFactory enemyFactory;

  BattleCamp battleCamp;

  @Before
  public void setUp() throws Exception {
    BattleCamp battleCamp = new BattleCamp("Camp 1", "Camp 1 description", "bomber", 1);
  }

  @Test
  public void addPlaneEnemy() {
    enemy = enemyFactory.createEnemy(enemy.type);
    assertEquals("plane", enemy.type);

    boolean isPlane = false;

    if (enemy.type == "plane") {
      isPlane = true;
    }

    assertTrue(isPlane);

  }

  @Test
  public void addEathEnemy() {
    enemy = enemyFactory.createEnemy(enemy.type);
    assertEquals("earth", enemy.type);

    boolean isPlane = false;

    if (enemy.type == "earth") {
      isPlane = true;
    }

    assertTrue(isPlane);
  }

  @Test
  public void addBuildingEnemy() {
    enemy = enemyFactory.createEnemy(enemy.type);
    assertEquals("building", enemy.type);

    boolean isPlane = false;

    if (enemy.type == "building") {
      isPlane = true;
    }

    assertTrue(isPlane);
  }

  @Test
  public void addNavalEnemy() {
    enemy = enemyFactory.createEnemy(enemy.type);
    assertEquals("naval", enemy.type);
  }

  @Test
  public void removeEnemy() {
    enemy = enemyFactory.createEnemy(enemy.type);
    battleCamp.removeEnemy(enemy);
    assertEquals(null, battleCamp.enemy);
  }

  @Test
  public void getEnemy() {
    enemy = enemyFactory.createEnemy(enemy.type);
    battleCamp.getEnemy();
    assertEquals(enemy, battleCamp.enemy);
  }

  @Test
  public void getName() {

  }

  @Test
  public void getDescription() {
  }

  @Test
  public void getDificulty() {
  }
}