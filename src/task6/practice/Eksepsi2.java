package task6.practice;

public class Eksepsi2 {
  public static void main(String[] args) {
    try {
      int a[] = new int[2];
      try {
        int b = 0;
        int c = 1 / b;
      } catch (Exception e) {
        System.out.println("Exception thrown: " + e);
      }
      System.out.println("Access element three: " + a[3]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Exception thrown: " + e);
    }
    System.out.println("Out of block");
  }
}
/*
 * Kode program tersebut menangkap error yang terjadi secara urut dan
 * akan menampilkan Exception thrown: java.lang.ArithmeticException karena
 * pembagian dengan nol dan diikuti dengan Exception thrown:
 * java.lang.ArrayIndexOutOfBoundsException karena access
 * element yang melebihi panjang array.
 */