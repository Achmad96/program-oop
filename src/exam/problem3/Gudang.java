
package exam.problem3;

import java.util.ArrayList;

public class Gudang {
  private String lokasiGudang;
  private ArrayList<Kategori> daftarKategori;

  public Gudang(String lokasiGudang, ArrayList<Kategori> daftarKategori) {
    this.lokasiGudang = lokasiGudang;
    this.daftarKategori = daftarKategori;
  }

  public ArrayList<Kategori> getDaftarKategori() {
    return daftarKategori;
  }

  public String getLokasiGudang() {
    return lokasiGudang;
  }
}
