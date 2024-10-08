package exam.problem4;

public class Main {
  public static void main(String[] args) {
    Dokter dokter1 = new Dokter("Widodo", 30, "Jl. Ahmad yani");
    Pasien pasien1 = new Pasien("Joko", 35, "Jl. Bratang", "R12345");
    Pasien pasien2 = new Pasien("Budi", 50, "Jl. Jagir", "R1390");
    Pasien pasien3 = new Pasien("Adi", 45, "Jl. Ir. Soekarno", "R6345");
    Pasien pasien4 = new Pasien("Nugroho", 25, "Jl. Krukah", "R13738");
    Pasien pasien5 = new Pasien("Udin", 60, "Jl. Gunung Anyar", "R12738");

    dokter1.diagnosaPenyakit(pasien1, "Kanker Jantung");
    dokter1.diagnosaPenyakit(pasien2, "Tulang kropos");
    dokter1.diagnosaPenyakit(pasien3, "Infeksi");
    dokter1.diagnosaPenyakit(pasien4, "Diabetes");
    dokter1.diagnosaPenyakit(pasien5, "COVID");

    Ruangan ruangan1 = new Ruangan(1, 4);
    ruangan1.tambahPasien(pasien1);
    ruangan1.tambahPasien(pasien2);
    ruangan1.tambahPasien(pasien3);
    ruangan1.tambahPasien(pasien4);
    ruangan1.tambahPasien(pasien5);
  }
}
