package task5.modul2.praktikum3;

public class EncapTest {
  private String name;
  private int age;
  private String idNum;

  // Getter untuk mendapatkan nilai atribut
  public String getName() {
      return name;
  }

  public int getAge() {
      return age;
  }

  public String getIdNum() {
      return idNum;
  }

  // Setter untuk mengubah nilai atribut
  public void setName(String newName) {
      this.name = newName;
  }

  public void setAge(int newAge) {
      this.age = newAge;
  }

  public void setIdNum(String newIdNum) {
      this.idNum = newIdNum;
  }
}