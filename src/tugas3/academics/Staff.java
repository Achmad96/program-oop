package tugas3.academics;

public class Staff extends Employee {

  public Staff(String name, String email, String employeeId, String department) {
      super(name, email, employeeId, department);
  }

  public void supportOperations() {
      System.out.println(name + " is supporting operations in the " + department + " department.");
  }
}
