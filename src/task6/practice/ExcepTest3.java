package task6.practice;

public class ExcepTest3 {
  public static void main(String[] args) {
    int a = 3;
    int b = 0;
    try {
      System.out.println("Result: " + divide(a, b));
    } catch (Exception e) {
      System.out.println("Exception: " + e);
    }
  }

  private static int divide(int a, int b) throws Exception {
    if (b == 0) {
      throw new Exception("Second argument cannot be zero.");
    }
    return a / b;
  }
}

/*
 * Kode tersebut di atas menggunakan throws untuk melemparkan error dengan pesan
 * yang dikustomisasi.
 */