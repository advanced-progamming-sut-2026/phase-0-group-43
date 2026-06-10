package model.entity.plant;

import model.entity.Entity;
import model.entity.strategy.AttackStrategy;
import model.entity.plant.PlantName;

import java.util.Set;

public class Plant extends Entity {
    protected PlantName name;
    protected PlantType type;
    protected Set<PlantTag> tags;
    protected int sunCost;
    protected int cooldownTicks;
    protected int remainingCooldown;
    protected boolean isBoosted;
    protected int level;
    protected AttackStrategy attackStrategy;
    protected PlantFoodStrategy plantFoodStrategy;

    public Plant(model.entity.plant.PlantConfig plantConfig, AttackStrategy attackStrategy){
        this.name = plantConfig.getName();
        this.type = plantConfig.getType();
        this.sunCost = plantConfig.getSunCost();
        this.cooldownTicks = plantConfig.getCooldownTicks();
        this.tags = plantConfig.getTags();
        this.attackStrategy = attackStrategy;
    }

    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Plant() {

    }

    @Override
    public void onTick(Object board) {}
    public void applyPlantFood(Object board) {}
    public void upgrade() {}
}