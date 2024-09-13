package task5.modul2.praktikum1;
public class Main {
  public static void main(String[] args) {
    Mobil mobil = new Mobil();
    mobil.kecepatan = 120;
    mobil.warna = "Merah";
    mobil.jenisBahanBakar = "Bensin";
    mobil.bergerak();
    mobil.isiBahanBakar();
  
    Motor motor = new Motor();
    motor.kecepatan = 80;
    motor.warna = "Hitam";
    motor.jenisHandle = "Sport";
    motor.bergerak();
    motor.tipeHandle();
  
    Truk truk = new Truk();
    truk.kecepatan = 60;
    truk.warna = "Biru";
    truk.kapasitasMuat = 10;
    truk.bergerak();
    truk.muatBarang();  
  }
  
}
