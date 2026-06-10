package model.entity.zombie;

public class ZombieConfig{
    private final ZombieType type;
    private final int hitPoints;
    private final double speed;
    private final int eatDps;
    private final int waveCost;
    private final ArmorType[] armors;

    public ZombieConfig(ZombieType type, int hitPoints, double speed,
                        int eatDps, int waveCost, ArmorType[] armors) {
        this.type = type;
        this.hitPoints = hitPoints;
        this.speed = speed;
        this.eatDps = eatDps;
        this.waveCost = waveCost;
        this.armors = armors;
    }

    public ZombieType getType() {
        return type;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getSpeed() {
        return speed;
    }

    public int getEatDps() {
        return eatDps;
    }

    public int getWaveCost() {
        return waveCost;
    }

    public ArmorType[] getArmors() {
        return armors;
    }
}
