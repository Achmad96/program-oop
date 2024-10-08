package exam.problem1;

public class SepedaMotor extends Kendaraan {

    int kecepatan = 0;

    public SepedaMotor(int kecepatanMaksimal) {
        super(kecepatanMaksimal);
    }

    @Override
    public void bergerak() {
        if (kecepatan >= kecepatanMaksimal) {
            System.out.println("Motor sudah pada kecepatan maksimumnya...");
            return;
        }
        System.out.println("Motor: " + kecepatan + " km");
        kecepatan++;
    }
}
