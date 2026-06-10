package model.map;

import model.Zombie;

import java.util.ArrayList;
import java.util.List;

public class LawnMower {
    private final int row;
    private boolean used;

    public LawnMower(int row) {
        this.row = row;
        this.used = false;
    }

    public int getRow() {
        return row;
    }

    public boolean isUsed() {
        return used;
    }

    public List<Zombie> trigger(List<Zombie> rowZombies) {
        if (used) {
            return new ArrayList<>();
        }

        used = true;

        if (rowZombies == null) {
            return new ArrayList<>();
        }

        return new ArrayList<>(rowZombies);
    }
}
