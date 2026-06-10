package model.quest;

import model.entity.plant.PlantName;

public class Reward {
    private final RewardType rewardType;
    private int coinAmount;
    private int diamondAmount;
    private PlantName unlockablePlant;
    private String unlockableLevel;
    private PlantName seedPacketPlant;
    private int seedPacketCount;

    public Reward(int coinAmount, int diamondAmount) {
        this.rewardType = RewardType.CURRENCY;
        this.coinAmount = coinAmount;
        this.diamondAmount = diamondAmount;
    }

    public Reward(PlantName unlockablePlant) {
        this.rewardType = RewardType.UNLOCKABLE;
        this.unlockablePlant = unlockablePlant;
    }

    public Reward(PlantName seedPacketPlant, int seedPacketCount) {
        this.rewardType = RewardType.INVENTORY;
        this.seedPacketPlant = seedPacketPlant;
        this.seedPacketCount = seedPacketCount;
    }
}
