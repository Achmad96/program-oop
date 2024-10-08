package exam.problem2;

public class DompetDigital extends Transaksi implements Pembayaran {
  private double saldo = 0;

  public DompetDigital(String nomorTransaksi, double nominalTransaksi, double saldo) {
    super(nomorTransaksi, nominalTransaksi);
    this.saldo = saldo;
  }

  @Override
  public void validasiPembayaran() {
    try {
      final boolean isValid = saldo >= super.getNominalTransaksi();
      if (!isValid) {
        throw new TransaksiException("Gagal mengirim uang, karena saldo anda kurang...");
      }
      System.out.printf("Berhasil mengirim sebesar %.2f dengan menggunakan dompet digital...\n", this.saldo);
    } catch (TransaksiException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

}
