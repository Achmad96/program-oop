package exam.problem2;

public abstract class Transaksi {
  private String nomorTransaksi;
  private double nominalTransaksi;

  public Transaksi(String nomorTransaksi, double nominalTransaksi) {
    this.nomorTransaksi = nomorTransaksi;
    this.nominalTransaksi = nominalTransaksi;
  }

  public double getNominalTransaksi() {
    return nominalTransaksi;
  }

  public String getNomorTransaksi() {
    return nomorTransaksi;
  }
}
