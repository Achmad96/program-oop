package exam.problem2;

public class Main {
  public static void main(String[] args) {
    System.out.println("Transaksi yang valid");
    KartuKredit transaksi1 = new KartuKredit("T0001", 3000, "912938026712397");
    DompetDigital transaksi2 = new DompetDigital("T0002", 3000, 3000);
    TransferBank transaksi3 = new TransferBank("T0003", 3000, "4188923673462789");

    transaksi1.validasiPembayaran();
    transaksi2.validasiPembayaran();
    transaksi3.validasiPembayaran();

    System.out.println("\nTransaksi yang tidak valid");
    KartuKredit transaksi4 = new KartuKredit("T0004", 3000, "9129380267123979");
    DompetDigital transaksi5 = new DompetDigital("T0005", 3000, 2000);
    TransferBank transaksi6 = new TransferBank("T0006", 3000, "418892367346278");
    transaksi4.validasiPembayaran();
    transaksi5.validasiPembayaran();
    transaksi6.validasiPembayaran();
  }
}
