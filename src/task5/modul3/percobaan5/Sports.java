package task5.modul3.percobaan5;

public interface Sports {
  public void setHomeTeam(String name);
  public void setVisitingTeam(String name);
}

interface Football extends Sports {
  public void homeTeamScored(int points);
  public void visitingTeamScored(int points);
  public void endOfQuarter(int quarter);
}

interface Hockey extends Sports {
  public void homeGoalScored();
  public void visitingGoalScored();
  public void endOfPeriod(int period);
  public void overtimePeriod(int ot);
}

interface Event{
  public void organize();
}