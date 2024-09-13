package task1;
// Nama:  Achmad Raihan
// NIM:   09020623015

public class Main {
  public static void main(String[] args) {
    Handphone handphone = new Handphone();
    handphone.hidupkan();
    handphone.kirimSMS();
    handphone.lakukanPanggilan();
    handphone.matikan();

    Mahasiswa mahasiswa = new Mahasiswa();
    mahasiswa.membaca();
    mahasiswa.menyontek();
    mahasiswa.modifikasi();

    Matematika matematika = new Matematika();
    matematika.penambahan(10, 5);
    matematika.pengurangan(10, 5);
    matematika.perkalian(10, 5);
    matematika.pembagian(10, 5);
  }
}
