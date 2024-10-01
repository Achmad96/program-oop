package task6.practice;

public class ExcepTest {
  public static void main(String[] args) {
    try {
      int a[] = new int[2];
      int b = 0;
      int c = 1 / b;
      System.out.println("Access element three: " + a[3]);
    } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
      System.out.println("Exception thrown : " + e);
    }
    System.out.println("Out of the block");
  }
}

/*
 * Error yang akan ditangani pertama kali dari kode di atas adalah
 * ArithmeticException, karena penyebab dari error ini adalah pembagian dengan
 * nol yang dilakukan sebelum pengaksesan array dengan index yang melebihi
 * panjangnya.
 */