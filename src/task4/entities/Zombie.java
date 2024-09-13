package task4.entities;

import task4.abstracts.EntityBase;

public class Zombie extends EntityBase {
  public Zombie() {
    this.setHealth(70);
    this.setDamage(50);
  }
  
  @Override
  public void move() {
    System.out.println("Zombie is walking");
  }
}
