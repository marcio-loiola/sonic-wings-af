package org.sonicwings.af;

public class Plane {

  public String Name; /* pt-br: nome do avião  */
  public Double Health; /* pt-br: Vida */
  public Double MaxHealth; /* pt-br: Vida máxima */

  public Double Money; /* pt-br: dinheiro */
  public Double FirePower; /* pt-br: força do golpe */
  public Double ArmorPts; /* pt-br: pontos de blindagem */
  public String Weapon;  /* pt-br: Arma */
  public String ForceCamp; /* pt-br: Campo de força - acessório de blindagem */
  public String Hability; /* pt-br: Comportamento adicional */

  public Plane(String Name, Double Health, Double MaxHealth, Double FirePower, Double ArmorPts, String Weapon, String ForceCamp, String Hability) {
    this.Name = Name;
    this.Health = Health;
    this.MaxHealth = MaxHealth;
    this.FirePower = FirePower;
    this.ArmorPts = ArmorPts;
    this.Weapon = Weapon;
    this.ForceCamp = ForceCamp;
    this.Hability = Hability;
  }

  public void attack() {
    System.out.println("Player 1 attacks!");
  }


}




