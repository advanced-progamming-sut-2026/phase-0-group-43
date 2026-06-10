package model.entity.plant;

public class SeedPacketCard {
    private PlantName plantName;
    private boolean isSelected;
    private boolean isLocked;
    private boolean isBoosted;

    public SeedPacketCard(PlantName plantName, boolean isLocked) {
        this.plantName = plantName;
        this.isLocked = isLocked;
        this.isSelected = false;
        this.isBoosted = false;
    }
}
