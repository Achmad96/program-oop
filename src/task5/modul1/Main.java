package task5.modul1;

import task5.modul2.praktikum1.Mobil;
import task5.modul2.praktikum1.Motor;
import task5.modul2.praktikum1.Truk;

public class Main {

  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects.");
  }

  public static void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }
  
  public static void main(String[] args){
    myStaticMethod();

    Main myObj = new Main();
    myObj.myPublicMethod();
  }
  
}
