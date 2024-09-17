package task5.modul3.percobaan6;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Membuat objek scanner untuk input dari keyboard
    // Menampilkan pilihan kendaraan kepada pengguna
    System.out.println("Pilih jenis kendaraan:");
    System.out.println("1. Mobil");
    System.out.println("2. Motor");
    System.out.print("Masukkan pilihan Anda (1 atau 2): ");
    int pilihan = scanner.nextInt(); // Membaca input pilihan dari pengguna
    Kendaraan kendaraan; // Deklarasi variabel tipe interface Kendaraan
    // Memilih kendaraan berdasarkan input pengguna
    if (pilihan == 1) {
      kendaraan = new Mobil(); // Membuat objek Mobil
    } else if (pilihan == 2) {
      kendaraan = new Motor(); // Membuat objek Motor
    } else {
      System.out.println("Pilihan tidak valid.");
      scanner.close(); // Menutup scanner
      return;
    }
    // Melakukan aksi pada kendaraan berdasarkan input pengguna
    System.out.println("Pilih aksi:");
    System.out.println("1. Nyalakan mesin");
    System.out.println("2. Matikan mesin");
    System.out.print("Masukkan pilihan aksi Anda (1 atau 2): ");
    int aksi = scanner.nextInt(); // Membaca input aksi dari pengguna
    // Menjalankan aksi sesuai pilihan
    if (aksi == 1) {
      kendaraan.startEngine(); // Menyalakan mesin
    } else if (aksi == 2) {
      kendaraan.stopEngine(); // Mematikan mesin
    } else {
      System.out.println("Aksi tidak valid.");
    }
    scanner.close(); // Menutup scanner
  }
}