package exam.problem1;

public class Truk extends Kendaraan {
  int kecepatan = 0;
  int kapasitasMuatan;

  public Truk(int kecepatanMaksimal, int kapasitasMuatan) {
    super(kecepatanMaksimal);
    this.kapasitasMuatan = kapasitasMuatan;
  }

  @Override
  public void bergerak() {
    if (kecepatan >= kecepatanMaksimal) {
      System.out.println("Truk sudah pada kecepatan maksimumnya...");
      return;
    }
    System.out.println("Truk: " + kecepatan + " km");
    kecepatan++;
  }
}
