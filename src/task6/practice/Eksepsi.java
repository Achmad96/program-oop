package task6.practice;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Eksepsi {
  public static void main(String[] args) {
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

    try {
      int[] nums = { 1, 2, 3, 4 };
      System.out.println(nums[5]);
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Elemen tidak ditemukan!");
    }

    try {
      int a[] = new int[2];
      int b = 0;
      int c = 1 / b;
      System.out.printf("c = %d%n", c);
      System.out.println("Accessing index " + a[3]);
    } catch (IndexOutOfBoundsException | ArithmeticException e) {
      System.out.println("Terjadi error: " + e.getMessage());
    }

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

/* Pada kode try-catch pertama dibuat untuk menangani eksepsi */