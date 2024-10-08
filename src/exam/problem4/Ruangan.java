package exam.problem4;

import java.util.ArrayList;

public class Ruangan {
  private int nomorRuangan;
  private int kapasitas;

  private ArrayList<Pasien> daftarPasien = new ArrayList<>();

  public Ruangan(int nomorRuangan, int kapasitas) {
    this.nomorRuangan = nomorRuangan;
    this.kapasitas = kapasitas;
  }

  public void tambahPasien(Pasien pasien) {
    try {
      if (daftarPasien.size() + 1 > kapasitas) {
        throw new RuanganPenuhException();
      }
      daftarPasien.add(pasien);
    } catch (RuanganPenuhException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public void setKapasitas(int kapasitas) {
    this.kapasitas = kapasitas;
  }

  public int getNomorRuangan() {
    return nomorRuangan;
  }

  public int getKapasitas() {
    return kapasitas;
  }
}
