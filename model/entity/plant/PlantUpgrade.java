package model.entity.plant;

public class PlantUpgrade {
    private PlantName fromType;
    private PlantName toType;
    private int seedPacketCost;
    private int coinCost;

    public PlantUpgrade(PlantName fromType, PlantName toType, int seedPacketCost, int coinCost) {
        this.fromType = fromType;
        this.toType = toType;
        this.seedPacketCost = seedPacketCost;
        this.coinCost = coinCost;
    }

    public boolean canApply(Object user) { return false; }
    public Plant apply(Plant plant) { return null; }
}