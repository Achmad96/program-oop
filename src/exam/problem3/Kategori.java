package exam.problem3;

import java.util.ArrayList;

public class Kategori {
  private String namaKategori;
  private ArrayList<Produk> daftarProduk;

  public Kategori(String namaKategori, ArrayList<Produk> daftarProduk) {
    this.namaKategori = namaKategori;
    this.daftarProduk = daftarProduk;
  }

  public void tambahProduk(Produk produk) {
    this.daftarProduk.add(produk);
  }

  public void hapusProdukById(int id) {
    this.daftarProduk.remove(id);
  }

  public void updateProdukById(int id, Produk produk) {
    this.daftarProduk.set(id, produk);
  }

  public String getNamaKategori() {
    return namaKategori;
  }

  public ArrayList<Produk> getDaftarProduk() {
    return daftarProduk;
  }
}
