package exam.problem1;

public class Main {
    public static void main(String[] args) {
        Kendaraan mobil1 = new Mobil(100);
        Kendaraan motor1 = new SepedaMotor(90);
        Kendaraan truk1 = new Truk(30, 20);
        for (int i = 0; i < 100; i++) {
            mobil1.bergerak();
            motor1.bergerak();
            truk1.bergerak();
        }
        mobil1.bergerak();
        motor1.bergerak();
    }
}
