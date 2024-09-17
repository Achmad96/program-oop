package task5.modul3.percobaan1;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Pilih hewan: "); 
    System.out.println("1. Anjing");
    System.out.println("2. Kucing");
    System.out.print("Masukkan pilihan Anda (1 atau 2): ");
    int pilihan = scanner.nextInt();
    Hewan hewan; // Referensi polimorfisme
    scanner.close();
    if (pilihan == 1) {
    hewan = new Anjing(); // Polimorfisme, objek Anjing
    } else if (pilihan == 2) {
      hewan = new Kucing(); // Polimorfisme, objek Kucing
    }  else {
      System.out.println("Pilihan tidak valid.");
      return;
    }
    hewan.suara(); // Memanggil metode suara secara polimorfik
  }
}