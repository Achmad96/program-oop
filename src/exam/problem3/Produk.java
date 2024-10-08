package exam.problem3;

public class Produk {
  private String nama;
  private double harga;
  private int stok;

  public Produk(String nama, double harga, int stok) {
    this.nama = nama;
    this.harga = harga;
    this.stok = stok;
  }

  public void setStok(int stok) {
    this.stok = stok;
  }

  public void setHarga(double harga) {
    this.harga = harga;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getNama() {
    return nama;
  }

  public double getHarga() {
    return harga;
  }

  public int getStok() {
    return stok;
  }
}
