package task5.modul3.praktikum;

public class Item {
  protected String judul;
  protected int tahunTerbit;

  public Item(String judul, int tahunTerbit) {
    this.judul = judul;
    this.tahunTerbit = tahunTerbit;
  }

  public void tampilkanInfo() {
    System.out.println("Judul: " + judul);
    System.out.println("Tahun Terbit: " + tahunTerbit);
  }
}

class Buku extends Item {
  private String pengarang;
  private int jumlahHalaman;

  public Buku(String judul, int tahunTerbit, String pengarang, int jumlahHalaman) {
    super(judul, tahunTerbit);
    this.pengarang = pengarang;
    this.jumlahHalaman = jumlahHalaman;
  }

  @Override
  public void tampilkanInfo() {
    super.tampilkanInfo();
    System.out.println("Pengarang: " + pengarang);
    System.out.println("Jumlah Halaman: " + jumlahHalaman);
  }
}

class Majalah extends Item {
  private String edisi;
  private int volume;

  public Majalah(String judul, int tahunTerbit, String edisi, int volume) {
    super(judul, tahunTerbit);
    this.edisi = edisi;
    this.volume = volume;
  }

  @Override
  public void tampilkanInfo() {
    super.tampilkanInfo();
    System.out.println("Edisi: " + edisi);
    System.out.println("Volume: " + volume);
  }
}

class DVD extends Item {
  private int durasi;
  private String genre;

  public DVD(String judul, int tahunTerbit, int durasi, String genre) {
    super(judul, tahunTerbit);
    this.durasi = durasi;
    this.genre = genre;
  }

  @Override
  public void tampilkanInfo() {
    super.tampilkanInfo();
    System.out.println("Durasi: " + durasi + " menit");
    System.out.println("Genre: " + genre);
  }
}

class Main {
  public static void main(String[] args) {
    Buku buku = new Buku("Pemrograman Java", 2020, "Budi Raharjo", 450);
    Majalah majalah = new Majalah("Majalah Teknologi", 2021, "Edisi 12", 5);
    DVD dvd = new DVD("Film Sci-Fi", 2019, 120, "Science Fiction");

    System.out.println("Informasi Buku:");
    buku.tampilkanInfo();
    System.out.println("\nInformasi Majalah:");
    majalah.tampilkanInfo();
    System.out.println("\nInformasi DVD:");
    dvd.tampilkanInfo();
  }
}
