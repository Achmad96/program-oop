package abstractinterface.abstracts;

import abstractinterface.interfaces.Entity;

public abstract class EntityBase implements Entity {

  private int health;
  private int damage;

  @Override public void takeDamage() {
      this.health -= damage;
      System.out.println(this.getClass().getSimpleName() + " takes " + damage + " damage.");
      if (this.health <= 0) {
          System.out.println(this.getClass().getSimpleName() + " dies.");
      }
  }

  public void attack(Entity entity) {
      System.out.println(this.getClass().getSimpleName() + " attacks.");
      entity.takeDamage();
  }

  @Override public int getHealth() {
      return this.health;
  }

  @Override public void setDamage(int damage) {
      this.damage = damage;
  }

  @Override public int getDamage() {
    return damage;
  } 

  @Override public void setHealth(int health) {
      this.health = health;
  }

  @Override public abstract void move();
}
