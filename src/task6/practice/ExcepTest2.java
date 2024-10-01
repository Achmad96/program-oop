package task6.practice;

public class ExcepTest2 {
  public static void main(String[] args) {
    System.out.println(testFinallyBlock());
  }

  private static int testFinallyBlock() {
    int a[] = new int[2];
    try {
      return 1;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Exception thrown: " + e);
    } finally {
      a[0] = 6;
      System.out.println("First elemen value: " + a[0]);
      System.out.println("The finally statement is executed");
    }
    return 0;
  }
}

/*
 * Kode di atas menunjukkan bahwa kode yang ada di dalam blok finally akan
 * dipanggil terlebih dahulu diikuti dengan return 1 yang berada di dalam blok
 * try.
 */
