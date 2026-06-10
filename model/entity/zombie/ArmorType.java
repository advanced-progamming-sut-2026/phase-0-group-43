package model.entity.zombie;

public enum ArmorType {
    CONE(370),
    BUCKET(1100),
    BRICK(2200),
    SHOULDER_ARMOR(1600),
    CROWN(1600),
    NEWSPAPER(800);

    private final int baseHealth;

    ArmorType(int baseHealth) {
        this.baseHealth = baseHealth;
    }

    public int getBaseHealth() {
        return baseHealth;
    }
}