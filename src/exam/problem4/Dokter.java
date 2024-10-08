package exam.problem4;

public class Dokter extends Manusia {

  public Dokter(String nama, int usia, String alamat) {
    super(nama, usia, alamat);
  }

  public void diagnosaPenyakit(Pasien pasien, String namaPenyakit) {
    pasien.tambahRiwayatPenyakit(namaPenyakit);
  }

}
