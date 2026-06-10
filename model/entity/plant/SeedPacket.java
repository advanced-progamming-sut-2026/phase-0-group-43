package model.entity.plant;

public class SeedPacket {
    private PlantName plantName;
    private int count;

    public SeedPacket(PlantName plantName, int count) {
        this.plantName = plantName;
        this.count = count;
    }
}
