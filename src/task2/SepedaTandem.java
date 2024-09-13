package task2;
public class SepedaTandem extends Sepeda {
  private int sadel;
  public void setSadel(int sadel) {
    this.sadel = getGir() - sadel;
  }
  public int getSadel() {
    return sadel;
  }
}
