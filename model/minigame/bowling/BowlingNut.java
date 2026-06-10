package model.minigame.bowling;
import model.entity.plant.Plant;

public class BowlingNut extends Plant{
    private final BowlingNutType bowlingNutType;
    private boolean isMoving;
    private int currentRow;
    private int currentCol;
    private double angle;
    private int hitCount;
    private boolean hasExploded;

    public BowlingNut(BowlingNutType type, int row, int col) {
        super();
        this.bowlingNutType = type;
        this.currentRow     = row;
        this.currentCol     = col;
        this.angle          = 0.0;   // starts moving right
        this.isMoving       = false; // set to true once the player "plants" it
        this.hitCount       = 0;
        this.hasExploded    = false;
    }
}
