package tugas3.academics;

public class Faculty extends Employee {
  protected String title;

  public Faculty(String name, String email, String employeeId, String department, String title) {
      super(name, email, employeeId, department);
      this.title = title;
  }

  public void conductResearch() {
      System.out.println(name + " is conducting research.");
  }

  public String getTitle() {
      return title;
  }
}
