package model.game;

public class SunManager {
    private int currentSun;

    public SunManager(int initialSun){
        this.currentSun = Math.max(initialSun,0);
    }
    public int getCurrentSun() {
        return currentSun;
    }
    public void addSun(int amount) {
        if (amount > 0) {
            currentSun += amount;
        }
    }
    public boolean canSpend(int amount) {
        return amount >= 0 && currentSun >= amount;
    }
    public boolean spendSun(int amount) {
        if (!canSpend(amount)) {
            return false;
        }

        currentSun -= amount;
        return true;
    }
}
