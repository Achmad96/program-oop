package exam.problem4;

public class RuanganPenuhException extends Exception {
  public RuanganPenuhException() {
    super("Ruangan penuh! silahkan pilih ruangan yang lain...");
  }
}
