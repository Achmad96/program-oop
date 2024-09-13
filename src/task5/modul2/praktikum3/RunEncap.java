package task5.modul2.praktikum3;

public class RunEncap {
  public static void main(String[] args) {
      EncapTest encap = new EncapTest();

      // Mengatur nilai atribut menggunakan setter
      encap.setName("James");
      encap.setAge(20);
      encap.setIdNum("12343ms");

      // Mendapatkan nilai atribut menggunakan getter dan mencetaknya
      System.out.println("Name: " + encap.getName() + ", Age: " + encap.getAge());
  }
}