package exam.problem1;

public class Mobil extends Kendaraan {

    int kecepatan = 0;

    public Mobil(int kecepatanMaksimal) {
        super(kecepatanMaksimal);
    }

    @Override
    public void bergerak() {
        if (kecepatan >= kecepatanMaksimal) {
            System.out.println("Mobil sudah pada kecepatan maksimumnya...");
            return;
        }
        System.out.println("Mobil: " + kecepatan + " km");
        kecepatan++;
    }
}
