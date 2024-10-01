package daysevendemo;

public class NegativeException extends Exception {
  public NegativeException() {
    super("The number must greater than 0");
  }
}
