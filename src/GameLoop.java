package src;

abstract class GameObject {
    int x, y;
    abstract void update();
}

class Player extends GameObject {
    void update() { System.out.println("Player moves"); }
    void attack() { System.out.println("Player attacks!"); }
}

class Enemy extends GameObject {
    void update() { System.out.println("Enemy patrols"); }
    void dropLoot() { System.out.println("Enemy drops coin!"); }
}

public class GameLoop {
    public static void main(String[] args) {
        GameObject[] objs = { new Player(), new Enemy(), new Enemy() };

        for (GameObject obj : objs) {
            obj.update();

            if (obj instanceof Player) {
                ((Player) obj).attack();   // downcast → dùng attack()
            } else if (obj instanceof Enemy) {
                ((Enemy) obj).dropLoot();  // downcast → dùng dropLoot()
            }
        }
    }
}
