package task6.practice;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Eksepsi {
  public static void main(String[] args) {
    getException1();
    getException2();
    getException3();
  }

  public static void getException1() {
    try {
      File file = new File("D://test1.txt");
      FileReader fileReader = new FileReader(file);
      int i;
      while ((i = fileReader.read()) != -1) {
        if ((char) i == ' ') {
          System.out.print(" ");
          continue;
        }
        System.out.print((char) i);
      }
      fileReader.close();
      System.out.println();
    } catch (IOException e) {
      System.out.println("File tidak ditemukan!");
    }
  }

  public static void getException2() {
    try {
      int[] nums = { 1, 2, 3, 4 };
      System.out.println(nums[5]);
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Elemen tidak ditemukan!");
    }
  }

  public static void getException3() {
    try {
      Scanner input = new Scanner(System.in);
      System.out.print("Masukkan angka: ");
      int angka = input.nextInt();
      if (isNegative(angka)) {
        input.close();
      }
      System.out.println("Angka yang kamu masukkan adalah " + angka);
      input.close();
    } catch (NegativeException e) {
      e.printStackTrace();
    }
  }

  public static boolean isNegative(int num) throws NegativeException {
    if (num < 0) {
      throw new NegativeException();
    }
    return false;
  }
}
/*
 * Kode eksepsi pertama
 * Jika file test1.txt tidak ada di lokasi yang ditentukan, maka program akan
 * menampilkan "File tidak ditemukan!".
 * 
 * Kode eksepsi kedua
 * Karena nums[5] tidak ada, eksepsi IndexOutOfBoundsException dilempar, dan
 * pesan "Elemen tidak ditemukan!" akan ditampilkan.
 * 
 * Kode eksepsi ketiga
 * Eksepsi pertama yang akan terjadi adalah ArithmeticException karena pembagian
 * dengan nol. Program akan menangkap eksepsi ini, menampilkan pesan
 * "Terjadi error: / by zero".
 * Jika ArithmeticException tidak terjadi, program akan menangkap
 * IndexOutOfBoundsException ketika mencoba mengakses indeks a[3].
 * 
 */