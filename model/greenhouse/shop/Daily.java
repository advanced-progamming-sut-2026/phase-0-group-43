package model.greenhouse.shop;
import model.entity.plant.PlantName;
import java.time.LocalDate;

public class Daily {

    public static final int BASE_PRICE = 2000;
    public static final double DISCOUNT = 0.20;
    public static final int DISCOUNTED_PRICE = 1600 ;
    public static final int SEED_PACKETS = 10;

    private PlantName offeredPlant;
    private LocalDate offerDate;
    private boolean purchased;

    public Daily(PlantName offeredPlant, LocalDate offerDate) {
        this.offeredPlant = offeredPlant;
        this.offerDate    = offerDate;
        this.purchased    = false;
    }

    public Daily() {

    }

    public boolean isPurchased() { return purchased; }
    public boolean isValidToday() {
        return false;
    }


}