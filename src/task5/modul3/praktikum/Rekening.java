package task5.modul3.praktikum;

public abstract class Rekening {
  protected String nomorRekening;
  protected double saldo;

  public Rekening(String nomorRekening, double saldo) {
    this.nomorRekening = nomorRekening;
    this.saldo = saldo;
  }

  public void setorUang(double jumlah) {
    saldo += jumlah;
    System.out.println("Setor: Rp " + jumlah + ", Saldo sekarang: Rp " + saldo);
  }

  public abstract void tarikUang(double jumlah);
}

class RekeningTabungan extends Rekening {
  public RekeningTabungan(String nomorRekening, double saldo) {
    super(nomorRekening, saldo);
  }

  @Override
  public void tarikUang(double jumlah) {
    if (saldo >= jumlah) {
      saldo -= jumlah;
      System.out.println("Tarik dari Rekening Tabungan: Rp " + jumlah + ", Saldo sekarang: Rp " + saldo);
    } else {
      System.out.println("Saldo tidak mencukupi di Rekening Tabungan.");
    }
  }
}

class RekeningGiro extends Rekening {
  public RekeningGiro(String nomorRekening, double saldo) {
    super(nomorRekening, saldo);
  }

  @Override
  public void tarikUang(double jumlah) {
    if (saldo + 1000000 >= jumlah) {
      saldo -= jumlah;
      System.out.println("Tarik dari Rekening Giro: Rp " + jumlah + ", Saldo sekarang: Rp " + saldo);
    } else {
      System.out.println("Saldo tidak mencukupi, batas overdraft terlampaui di Rekening Giro.");
    }
  }
}

class RekeningDeposito extends Rekening {
  public RekeningDeposito(String nomorRekening, double saldo) {
    super(nomorRekening, saldo);
  }

  @Override
  public void tarikUang(double jumlah) {
    System.out.println("Penarikan tidak dapat dilakukan dari Rekening Deposito sebelum jatuh tempo.");
  }
}

class Main {
  public static void main(String[] args) {
    RekeningTabungan tabungan = new RekeningTabungan("001", 500000);
    RekeningGiro giro = new RekeningGiro("002", 200000);
    RekeningDeposito deposito = new RekeningDeposito("003", 1000000);

    tabungan.setorUang(100000);
    tabungan.tarikUang(200000);

    giro.setorUang(50000);
    giro.tarikUang(300000);

    deposito.tarikUang(100000);
  }
}
