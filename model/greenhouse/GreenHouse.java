package model.greenhouse;

import model.entity.plant.PlantName;

import java.util.List;

public class GreenHouse {
    private List<Pot> pots;
    private Grid[][] grids = new Grid[4][5];
    public GreenHouse() {
        for(int i = 0; i < 4; i++) {
            if(i>=1) {
                for (int j = 0; j < 5; j++) {
                    grids[i][j] = new Grid();
                    grids[i][j].setLocked(true);
                }
            }else{
                for (int j = 0; j < 5; j++) {
                    grids[i][j] = new Grid();
                    grids[i][j].setLocked(false);
                }
            }
        }
    }

    public void collect(int row, int column) {}
    public void grow(int row, int column) {}
    public void checkIfReadyToCollect(int row, int column) {}
    public boolean unlock(int row, int col){return false;}
    public boolean plant(int row, int col, PlantName name, boolean isNormal){return false;}
}
