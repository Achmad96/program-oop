package task5.modul3.praktikum;

public class Hewan {
  public void suara() {
    System.out.println("Hewan membuat suara");
  }
}

class Burung extends Hewan {
  public void suara() {
    System.out.println("Burung membuat suara");
  }
}

class Main {
  public static void main(String[] args) {
    Burung burung1 = new Burung();
    Hewan[] hewans = { burung1 };
    for (Hewan hewan : hewans) {
      hewan.suara();
    }
  }
}