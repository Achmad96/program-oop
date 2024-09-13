package task5.modul2.praktikum2;

class KomponenMobil {
  String namaKomponen; // Menggunakan akses private untuk menyembunyikan detail implementasi

  public KomponenMobil(String namaKomponen) {
      this.namaKomponen = namaKomponen;
  }

  public void tampilkanInfo() {
      System.out.println("Komponen: " + namaKomponen);
  }
}

// Subclass Mesin yang mewarisi KomponenMobil
class Mesin extends KomponenMobil {
  public Mesin(String namaMesin) {
      super(namaMesin); // Memanggil konstruktor superclass
  }

  public void nyalakanMesin() {
      System.out.println(namaKomponen + " dinyalakan.");
  }
}

// Subclass Baterai yang mewarisi KomponenMobil
class Baterai extends KomponenMobil {
  public Baterai(String namaBaterai) {
      super(namaBaterai);
  }

  public void cekBaterai() {
      System.out.println(namaKomponen + " diperiksa.");
  }
}

// Kelas Mobil yang memiliki objek Mesin dan Baterai (Agregasi)
class Mobil {
  private Mesin mesin;
  private Baterai baterai;

  public Mobil(Mesin mesin, Baterai baterai) {
      this.mesin = mesin;
      this.baterai = baterai;
  }

  public void mulaiJalan() {
      System.out.println("Mobil mulai berjalan...");
      mesin.nyalakanMesin();
      baterai.cekBaterai();
  }
}

public class Main {
  public static void main(String[] args) {
      // Membuat objek Mesin dan Baterai
      Mesin mesin = new Mesin("Mesin VB");
      Baterai baterai = new Baterai("Baterai Lithium-ion");

      // Membuat objek Mobil yang memiliki Mesin dan Baterai (Agregasi)
      Mobil mobil = new Mobil(mesin, baterai);

      // Memulai mobil
      mobil.mulaiJalan();
  }
}