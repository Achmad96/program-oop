package abstractinterface.interfaces;

/**
 * Entity
 */
public interface Entity {
    void move();
    void takeDamage();
    void setDamage(int damage);
    int getDamage();
    void setHealth(int health);
    int getHealth();
}
