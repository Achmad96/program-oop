package task6;

import java.util.Scanner;

public class Eksepsi {
  public static void main(String[] args) {
    final Scanner input = new Scanner(System.in);
    try {
      System.out.print("Nama: ");
      final String nama = input.nextLine();
      System.out.print("Umur: ");
      final int umur = Integer.parseInt(input.nextLine());
      validate(nama, umur);
      System.out.printf("""
          BIOGRAPHY
            nama: %s
            umur: %d%n
            """, nama, umur);
    } catch (IllegalArgumentException e) {
      System.out.println("Error: " + e.getMessage());
    }
    input.close();
  }

  public static void validate(String nama, int umur) {
    if (nama.matches(".[0-9]+") || umur < 0) {
      throw new IllegalArgumentException("Error: nama harus berupa huruf, dan umur harus positif");
    }
  }
}
