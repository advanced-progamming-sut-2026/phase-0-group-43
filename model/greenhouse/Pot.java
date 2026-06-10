package model.greenhouse;
import model.entity.plant.Plant;
import model.entity.plant.PlantName;
import model.greenhouse.PotStatus;
import java.time.LocalDateTime;

public class Pot {
    private Plant plant;
    private PlantName plantName;
    private boolean isNormal;
    private boolean ready;
    private int row;
    private int column;
    private LocalDateTime plantedAt;
    private int harvestDuration;
    private int harvestTime;
    private PotStatus status;

    public Pot(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getHarvestTime(){return 0;}
    public void plantSeed(PlantName name, boolean normal){
        plantedAt = LocalDateTime.now();
    }
    public boolean checkReady(){return false;}
    public long hoursRemaining(){return 0;}
    public void clearPot(){}
    public boolean potIsEmpty(){return false;}
}
