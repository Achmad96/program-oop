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
