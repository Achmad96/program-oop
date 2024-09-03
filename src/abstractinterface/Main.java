package abstractinterface;

import abstractinterface.entities.Player;
import abstractinterface.entities.Zombie;

/**
 * Main
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