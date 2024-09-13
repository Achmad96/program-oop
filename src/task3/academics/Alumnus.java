package task3.academics;

public class Alumnus extends CommunityMember {
  private String graduationYear;

  public Alumnus(String name, String email, String graduationYear) {
      super(name, email);
      this.graduationYear = graduationYear;
  }

  public void donate() {
      System.out.println(name + " is donating as an alumnus of the class of " + graduationYear + ".");
  }

  public String getGraduationYear() {
      return graduationYear;
  }
}
