package model.minigame.izombie;
import model.entity.zombie.ZombieType;

public class ZombieCard {

    private final ZombieType zombieType;
    private final int sunCost;

    public ZombieCard(ZombieType zombieType, int sunCost) {
        this.zombieType  = zombieType;
        this.sunCost     = sunCost;
    }

    public ZombieType getZombieType() { return zombieType; }
    public int getSunCost()           { return sunCost; }
}