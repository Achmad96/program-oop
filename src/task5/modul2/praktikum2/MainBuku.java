package task5.modul2.praktikum2;

import java.util.ArrayList;
import java.util.List;

// Kelas Buku
class Buku {
    private String judul;
    private String penulis;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    @Override
    public String toString() {
        return "Buku [Judul: " + judul + ", Penulis: " + penulis + "]";
    }
}

// Kelas Perpustakaan
class Perpustakaan {
    private List<Buku> bukuList;

    public Perpustakaan() {
        bukuList = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        bukuList.add(buku);
    }

    public void tampilkanBuku() {
        System.out.println("Daftar Buku di Perpustakaan:");
        for (Buku buku : bukuList) {
            System.out.println(buku);
        }
    }
}

// Main Class
public class MainBuku {
    public static void main(String[] args) {
        // Membuat beberapa objek Buku
        Buku buku1 = new Buku("Pemrograman Java", "Andi");
        Buku buku2 = new Buku("Pemrograman Python", "Budi");

        // Membuat objek Perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan();

        // Menambahkan Buku ke Perpustakaan
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        // Menampilkan daftar buku
        perpustakaan.tampilkanBuku();
    }
}

