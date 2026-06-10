package model.minigame.izombie;

public class Brain {

    private final int row;
    private boolean isEaten;

    public Brain(int row) {
        this.row    = row;
        this.isEaten = false;
    }

    public boolean eat() {return false;}

    public int getRow()    { return row; }
    public boolean isEaten() { return isEaten; }
}
