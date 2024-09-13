package task4;

import task4.entities.Player;
import task4.entities.Zombie;

/**
 * Achmad Raihan
 * 09020623015
 */
public class Main {

  public static void main(String[] args) {
    Player player = new Player();
    Zombie zombie = new Zombie();

    player.move();
    player.attack(zombie);
    player.attack(zombie);
    zombie.move();
  }
}