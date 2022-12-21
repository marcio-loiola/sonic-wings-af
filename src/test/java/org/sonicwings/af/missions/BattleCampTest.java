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
  public void addPlaneEnemyByType() {

    /* Given */
    enemy = enemyFactory.createEnemy(enemy.type);
    assertEquals("plane", enemy.type);

    /* When */

    boolean isPlane = false;

    if (enemy.type == "plane") {
      isPlane = true;
    }

    /* Then */

    assertTrue(isPlane);
  }

  @Test
  public void addEathEnemyByType() {

    /* Given */
    enemy = enemyFactory.createEnemy(enemy.type);
    assertEquals("earth", enemy.type);

    /* When */
    boolean isPlane = false;

    if (enemy.type == "earth") {
      isPlane = true;
    }

    /* Then */
    assertTrue(isPlane);
  }

  @Test
  public void addBuildingEnemyByType() {
    /* Given */
    enemy = enemyFactory.createEnemy(enemy.type);
    assertEquals("building", enemy.type);

    boolean isEarth = false;

    /* When */

    if (enemy.type == "building") {
      isEarth = true;
    }

    /* Then */
    assertTrue(isEarth);
  }

  @Test
  public void addNavalEnemy() {

    /* Given */
    enemy = enemyFactory.createEnemy(enemy.type);
    assertEquals("naval", enemy.type);

    /* When */
    
    boolean isNaval = false;
    
    if (enemy.type == "naval") {
      isNaval = true;
    }
    
    /* Then */
    assertTrue(isNaval);
  }

  @Test
  public void removeEnemy() {
    /* Given */
    enemy = enemyFactory.createEnemy(enemy.type);

    /* When */
    battleCamp.removeEnemy(enemy);

    /* Then */
    assertEquals(null, battleCamp.enemy);
  }

  @Test
  public void getEnemy() {
    /* Given */
    enemy = enemyFactory.createEnemy(enemy.type);

    /* When */
    battleCamp.getEnemy();

    /* Then */
    assertEquals(enemy, battleCamp.enemy);
  }

  @Test
  void test(){
    fail("The method is doesn't work properly!");
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