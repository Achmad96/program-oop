package task3.academics;

// NIM: 09020623015
// Nama: Achmad Raihan

public class CommunityMember {
  protected String name;
  protected String email;

  public CommunityMember(String name, String email) {
      this.name = name;
      this.email = email;
  }

  public void attendEvent() {
      System.out.println(name + " is attending an event.");
  }

  public String getName() {
      return name;
  }

  public String getEmail() {
      return email;
  }
}
