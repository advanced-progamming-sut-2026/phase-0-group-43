package model.entity.plant;

import java.util.Set;

public class PlantConfig {
    private final PlantName name;
    private final PlantType type;
    private final int sunCost;
    private final int cooldownTicks;
    private final int health;
    private final Set<PlantTag> tags;
    private final int damage;

    public PlantConfig(PlantName name, PlantType type, int sunCost, int cooldownTicks, int health, Set<PlantTag> tags, int damage) {
        this.name = name;
        this.type = type;
        this.sunCost = sunCost;
        this.cooldownTicks = cooldownTicks;
        this.health = health;
        this.tags = tags;
        this.damage = damage;
    }

    public PlantName getName() {
        return name;
    }

    public PlantType getType() {
        return type;
    }

    public int getSunCost() {
        return sunCost;
    }

    public int getCooldownTicks() {
        return cooldownTicks;
    }

    public int getHealth() {
        return health;
    }

    public Set<PlantTag> getTags() {
        return tags;
    }
}
