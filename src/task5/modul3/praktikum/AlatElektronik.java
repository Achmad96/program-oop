package task5.modul3.praktikum;

import java.util.Scanner;

public interface AlatElektronik {
  public void hidupkan();

  public void matikan();
}

class Televisi implements AlatElektronik {
  @Override
  public void hidupkan() {
    System.out.println("Televisi hidup");
  }

  @Override
  public void matikan() {
    System.out.println("Televisi mati");
  }

}

class Radio implements AlatElektronik {
  @Override
  public void hidupkan() {
    System.out.println("Radio hidup");
  }

  @Override
  public void matikan() {
    System.out.println("Radio mati");
  }

}

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Pilih alat elektronik: ");
    System.out.println("1. Televisi");
    System.out.println("2. Radio");
    System.out.print("Masukkan pilihan Anda (1 atau 2): ");
    int pilihan = input.nextInt();
    AlatElektronik alatElektronik;

    if (pilihan == 1) {
      alatElektronik = new Televisi();
    } else if (pilihan == 2) {
      alatElektronik = new Radio();
    } else {
      System.out.println("Pilihan tidak valid");
      input.close();
      return;
    }

    System.out.println("Pilih aksi: ");
    System.out.println("1. hidupkan");
    System.out.println("2. matikan");
    System.out.print("Masukkan pilihan Anda (1 atau 2): ");
    int aksi = input.nextInt();
    input.close();
    if (aksi == 1) {
      alatElektronik.hidupkan();
    } else if (aksi == 2) {
      alatElektronik.matikan();
    } else {
      System.out.println("Pilihan tidak valid");
    }
  }
}