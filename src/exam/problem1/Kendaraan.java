package exam.problem1;

public class Kendaraan {
    int kecepatanMaksimal = 1;

    public Kendaraan(int kecepatanMaksimal) {
        this.kecepatanMaksimal = kecepatanMaksimal;
    }

    public void bergerak() {
        System.out.println("Kendaraan bergerak dengan kecepatan maksimal " + kecepatanMaksimal);
    }
}
