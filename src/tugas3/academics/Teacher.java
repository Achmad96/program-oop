package tugas3.academics;

public class Teacher extends Faculty {

  public Teacher(String name, String email, String employeeId, String department, String title) {
      super(name, email, employeeId, department, title);
  }

  public void teach() {
      System.out.println(name + " is teaching a class.");
  }
}
