package org.sonicwings.af;

import java.io.IOException;
import java.util.Scanner;
import org.sonicwings.af.ASCIIArtGenerator;

public class Menu {
  public static void clearScreen() {
    for (int i = 0; i < 60; i++) System.out.println();
  }

  public static String scann() {
    Scanner scan = new Scanner(System.in);
    return scan.nextLine();
  }



}
