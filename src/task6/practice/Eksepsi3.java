package task6.practice;

public class Eksepsi3 {
  public static void main(String[] args) {
    try {
      int a[] = new int[2];
      try {
        int b = 0;
        int c = 1 / b;
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Exception thrown: " + e);
      }
      System.out.println("Access element " + a[3]);
    } catch (Exception e) {
      System.out.println("Exception thrown: " + e);
    }
    System.out.println("Out of block");
  }
}

/*
 * Alur dari error yang terjadi pertama kali adalah pembagian dengan nol yang
 * tidak ditangkap dengan baik karena kesalahan penggunaan sintaks eksepsi, yang
 * seharusnya ArithmaticException atau Exception dibanding
 * ArrayIndexOutOfBoundsException, sehingga penangkapan error tersebut terjadi
 * di luar dari blok.
 */
