package org.sonicwings.af.enemies;

/* Utilizando padrão de projeto factory method*/

public class EnemyFactory {
  public Enemy createEnemy(String type) {
    switch (type) {
      case "plane":
        return new A_Bomber(type);
      case "building":
        return new C_Barracks(type);
      case "earth":
        return new T_Tank(type);
      case "naval":
        return new N_Frigate(type);
      default:
        break;
    }
    return null;
  }
}
