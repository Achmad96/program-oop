package exam.problem4;

import java.util.ArrayList;

public class Pasien extends Manusia {

  private String nomorRekamMedis;
  private ArrayList<String> riwayatPenyakit = new ArrayList<>();

  public Pasien(String nama, int usia, String alamat, String nomorRekamMedis) {
    super(nama, usia, alamat);
    this.nomorRekamMedis = nomorRekamMedis;
  }

  public String getNomorRekamMedis() {
    return nomorRekamMedis;
  }

  public ArrayList<String> getRiwayatPenyakit() {
    return riwayatPenyakit;
  }

  public void tambahRiwayatPenyakit(String penyakit) {
    riwayatPenyakit.add(penyakit);
  }
}
