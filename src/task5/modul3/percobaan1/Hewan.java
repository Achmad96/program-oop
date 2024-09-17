package task5.modul3.percobaan1;
public class Hewan {
  public void suara() {
    System.out.println("Hewan membuat suara");
  } 
}

class Anjing extends Hewan {
  @Override
  public void suara() {
    System.out.println("Anjing membuat suara");
  }
}
class Kucing extends Hewan {
  @Override
  public void suara() {
    System.out.println("Kucing membuat suara");
  }
}