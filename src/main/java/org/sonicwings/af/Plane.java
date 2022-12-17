package org.sonicwings.af;

public class Plane {

  String Name;
  Double Vida;
  public Double MaxVida;
  public Double FirePower; /* pt-br: força do golpe */
  public Double ArmorPts; /* pt-br: pontos de blindagem */
  public String Weapon;  /* pt-br: Arma */
  public String ForceCamp; /* pt-br: Campo de força - acessório de blindagem */
  public String Hability; /* pt-br: Comportamento adicional */

  public Plane(String Name, Double Vida, Double MaxVida, Double FirePower, Double ArmorPts, String Weapon, String ForceCamp, String Hability) {
    this.Name = Name;
    this.Vida = Vida;
    this.MaxVida = MaxVida;
    this.FirePower = FirePower;
    this.ArmorPts = ArmorPts;
    this.Weapon = Weapon;
    this.ForceCamp = ForceCamp;
    this.Hability = Hability;
  }




}




