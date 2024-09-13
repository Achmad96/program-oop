package task3.academics;

public class Employee extends CommunityMember {
  protected String employeeId;
  protected String department;

  public Employee(String name, String email, String employeeId, String department) {
      super(name, email);
      this.employeeId = employeeId;
      this.department = department;
  }

  public void work() {
      System.out.println(name + " is working in the " + department + " department.");
  }

  public String getEmployeeId() {
      return employeeId;
  }

  public String getDepartment() {
      return department;
  }
}

