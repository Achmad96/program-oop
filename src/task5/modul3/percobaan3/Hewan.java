package task5.modul3.percobaan3;

public abstract class Hewan {
  public abstract void suara();
  public void tidur() {
    System.out.println("Hewan sedang tidur");
  }
}

class Anjing extends Hewan{
  @Override
  public void suara(){
    System.out.println("Anjing menggongong");
  }
}

class Kucing extends Hewan{
  @Override
  public void suara() {
    System.out.println("Kucing mengeong");
  }
}
