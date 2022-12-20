package org.sonicwings.af.enemies;

/* Utilizando padrão de projeto factory method*/

public class EnemyFactory {
  public Enemy createEnemy(String name) {

    switch (name) {
      case "finder":
        return new A_Finder();
      case "bomber":
        return new A_Bomber();
      case "caca":
        return new A_Hunter();
      case "porta_avioes":
        return new A_Carrier();
      case "tank":
        return new T_Tank();
      case "artilharia":
        return new T_Artillery();
      case "edificio":
        return new C_Building();
      case "quartel":
        return new C_Barracks();
      case "fragata":
        return new N_Frigate();
      case "corveta":
        return new N_Corvette();
      default:
        break;
    }
    return null;
  }
}
