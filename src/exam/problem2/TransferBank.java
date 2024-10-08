package exam.problem2;

public class TransferBank extends Transaksi implements Pembayaran {
  private String nomorRekening;

  public TransferBank(String nomorTransaksi, double nominalTransaksi, String nomorRekening) {
    super(nomorTransaksi, nominalTransaksi);
    this.nomorRekening = nomorRekening;
  }

  public String getNomorRekening() {
    return nomorRekening;
  }

  @Override
  public void validasiPembayaran() {
    try {
      final boolean isValid = nomorRekening.length() == 16;
      if (!isValid) {
        throw new TransaksiException("Gagal mengirim uang, karena panjang nomor rekening tepat 16.");
      }
      System.out.printf("Berhasil mengirim sebesar %.2f melalui transfer bank...\n", super.getNominalTransaksi());
    } catch (TransaksiException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}