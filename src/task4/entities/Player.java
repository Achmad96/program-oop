package task4.entities;

import task4.abstracts.EntityBase;

public class Player extends EntityBase {
  public Player () {
    this.setHealth(100);
    this.setDamage(30);
  }

  @Override
  public void move() {
    System.out.println("Player is moving");
  }
}
