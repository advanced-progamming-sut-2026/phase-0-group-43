package model.minigame.beghouled;

import model.entity.plant.PlantName;

public class PlantUpgradeOption {
    private final PlantName from;
    private final PlantName to;
    private final int sunCost;

    public PlantUpgradeOption(PlantName from, PlantName to, int sunCost) {
        this.from    = from;
        this.to      = to;
        this.sunCost = sunCost;
    }
}
