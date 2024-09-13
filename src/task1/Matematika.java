package task1;
public class Matematika {

  public void penambahan (double a, double b) {
    double hasil = a + b;
    System.out.printf( "%.2f + %.2f = %.2f %n", a, b, hasil);
  }

  public void penambahan(double a, double  b, double c) {
    double hasil = a + b + c;
    System.out.printf("%.2f + %.2f + %.2f = %.2f %n", a,  b, c, hasil);
  }

  public void pengurangan (double a, double b) {
    double hasil = a - b;
    System.out.printf( "%.2f - %.2f = %.2f %n", a, b, hasil);
  }

  public void pengurangan (double a, double b, double c) {
    double hasil = a - b - c;
    System.out.printf( "%.2f - %.2f - %.2f = %.2f %n", a, b, c, hasil);
  }

  public void perkalian (double a, double b) {
    double hasil = a * b;
    System.out.printf( "%.2f x %.2f = %.2f %n", a, b, hasil);
  }

  public void perkalian (double a, double b, double c) {
    double hasil = a * b * c;
    System.out.printf( "%.2f x %.2f x %.2f = %.2f %n", a, b, c, hasil);
  }

  public void pembagian (double a, double b) {
    double hasil = a / b;
    System.out.printf( "%.2f / %.2f = %.2f %n", a, b, hasil);
  }

  public void pembagian (double a, double b, double c) {
    double hasil = a / b / c;
    System.out.printf( "%.2f / %.2f / %.2f = %.2f %n", a, b, c, hasil);
  }
}
