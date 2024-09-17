package task5.modul3.percobaan6;

public interface Kendaraan {
  void startEngine();

  void stopEngine();
}

class Mobil implements Kendaraan {
  @Override
  public void startEngine() {
    System.out.println("Mesin mobil dinyalakan");
  }

  @Override
  public void stopEngine() {
    System.out.println("Mesin mobil dimatikan");
  }
}

class Motor implements Kendaraan {

  @Override
  public void startEngine() {
    System.out.println("Mesin motor dinyalakan");
  }

  @Override
  public void stopEngine() {
    System.out.println("Mesin motor dimatikan");
  }

}