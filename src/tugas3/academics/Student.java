package tugas3.academics;

public class Student extends CommunityMember {
  private String studentId;
  private String major;

  public Student(String name, String email, String studentId, String major) {
      super(name, email);
      this.studentId = studentId;
      this.major = major;
  }

  public void study() {
      System.out.println(name + " is studying " + major + ".");
  }

  public String getStudentId() {
      return studentId;
  }

  public String getMajor() {
      return major;
  }
}
