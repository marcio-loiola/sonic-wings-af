package org.sonicwings.af.equipment.weapons;

public class MachineGun_50 extends Weapon{

      public String description() {
          return "Metralhadora 50mm";
      }

      @Override
      public double armorPts() {
          return 0;
      }

      @Override
      public double attackPts() {
          return 0.01;
      }

      @Override
      public double price() {
          return 50;
      }

}
