package task1;

public class MatematikaCanggih {
  public void modulus (double a, double b) {
    double hasil = a % b;
    System.out.printf( "%.2f mod %.2f = %.2f %n", a, b, hasil);
  }

  public void modulus (double a, double b, double c) {
    double hasil = a % b % c;
    System.out.printf( "%.2f mod %.2f mod %.2f = %.2f %n", a, b, c, hasil);
  }
}
