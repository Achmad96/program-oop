package exam.problem2;

public class KartuKredit extends Transaksi implements Pembayaran {
  private String nomorKartu;

  public KartuKredit(String nomorTransaksi, double nominalTransaksi, String nomorKartu) {
    super(nomorTransaksi, nominalTransaksi);
    this.nomorKartu = nomorKartu;
  }

  @Override
  public void validasiPembayaran() {
    try {
      final boolean isValid = nomorKartu.length() >= 10 && nomorKartu.length() <= 15;
      if (!isValid) {
        throw new TransaksiException("Gagal mengirim uang, karena panjang nomor kartu harus 10 - 15 digit.");
      }
      System.out.printf("Berhasil mengirim sebesar %.2f dengan kartu kredit...\n", super.getNominalTransaksi());
    } catch (TransaksiException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
