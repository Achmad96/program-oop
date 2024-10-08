package exam.problem4;

public class Manusia {
  private String nama;
  private int usia;
  private String alamat;

  public Manusia(String nama, int usia, String alamat) {
    this.nama = nama;
    this.usia = usia;
    this.alamat = alamat;
  }

  public void setAlamat(String alamat) {
    this.alamat = alamat;
  }

  public void setUsia(int usia) {
    this.usia = usia;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getAlamat() {
    return alamat;
  }

  public String getNama() {
    return nama;
  }

  public int getUsia() {
    return usia;
  }
}
