package exam.problem3;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    final ArrayList<Produk> daftarProduk1 = new ArrayList<>();
    daftarProduk1.add(new Produk("Indomie", 2500, 75));
    daftarProduk1.add(new Produk("Sedaap", 2500, 70));
    daftarProduk1.add(new Produk("Sarimi", 3500, 25));

    final Kategori kategori1 = new Kategori("Mi instan", daftarProduk1);
    kategori1.tambahProduk(new Produk("Mie Samyang", 20000, 50));

    final ArrayList<Produk> daftarProduk2 = new ArrayList<>();
    final Kategori kategori2 = new Kategori("Minuman", daftarProduk2);
    daftarProduk2.add(new Produk("Teh botol", 7000, 20));
    daftarProduk2.add(new Produk("Teh kotak", 5000, 30));
    daftarProduk2.add(new Produk("Aqua", 3000, 25));

    ArrayList<Kategori> daftarKategori = new ArrayList<>();
    daftarKategori.add(kategori1);
    daftarKategori.add(kategori2);

    final Gudang gudang = new Gudang("Jl. Bratang Gede", daftarKategori);
    System.out.println("Lokasi gudang: " + gudang.getLokasiGudang());
    System.out.println("\nDaftar Produk yang ada di Gudang");
    for (Kategori kategori : gudang.getDaftarKategori()) {
      System.out.println("===================");
      for (Produk produk : kategori.getDaftarProduk()) {
        System.out.printf("""
            nama: %s
            harga: %.2f
            stok: %d
            kategori: %s
            ===================
            """, produk.getNama(), produk.getHarga(), produk.getStok(), kategori.getNamaKategori());
      }
    }
  }
}
