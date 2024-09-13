package task3.academics;

public class Administrator extends Faculty {
    private String adminRole;

    public Administrator(String name, String email, String employeeId, String department, String title, String adminRole) {
        super(name, email, employeeId, department, title);
        this.adminRole = adminRole;
    }

    public void manageDepartment() {
        System.out.println(name + " is managing the " + department + " department as a " + adminRole + ".");
    }

    public String getAdminRole() {
        return adminRole;
    }
}
