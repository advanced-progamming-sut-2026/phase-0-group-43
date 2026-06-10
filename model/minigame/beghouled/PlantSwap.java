package model.minigame.beghouled;
import model.entity.plant.Plant;
public class PlantSwap {
     Plant firstPlant;
     Plant secondPlant;
     int row1, column1;
     int row2, column2;
     boolean isValidSwap;

     public PlantSwap(Plant firstPlant,  int row1, int column1,
                      Plant secondPlant, int row2, int column2) {
          this.firstPlant  = firstPlant;
          this.row1        = row1;
          this.column1     = column1;
          this.secondPlant = secondPlant;
          this.row2        = row2;
          this.column2     = column2;
          this.isValidSwap = false;
     }

     public boolean areNearBy() {
          int horizontally = Math.abs(row1 - row2);
          int vertically = Math.abs(column1 - column2);
          return (horizontally == 1 && vertically == 0) || (horizontally == 0 && vertically == 1);
     }
}
