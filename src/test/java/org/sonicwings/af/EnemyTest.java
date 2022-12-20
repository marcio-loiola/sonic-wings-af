package org.sonicwings.af;

import org.junit.Before;
import org.sonicwings.af.enemies.Enemy;
import org.sonicwings.af.enemies.EnemyFactory;

import static org.junit.Assert.*;

public class EnemyTest {

  Enemy enemy;
  EnemyFactory enemyFactory;

  @Before
  public void setUp() throws Exception {
    enemyFactory.createEnemy("bomber");
  }




}