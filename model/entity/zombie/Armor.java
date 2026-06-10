package model.entity.zombie;

public class Armor {
    private final ArmorType type;
    private int currentHealth;
    private boolean isMagnetic;

    public Armor(ArmorType armorType) {
        this.currentHealth = armorType.getBaseHealth();
        this.type = armorType;
        this.isMagnetic = switch (armorType){
            case BUCKET -> true;
            case CROWN -> true;
            default -> false;
        };
    }


    public void takeDamage(int damage){}
    public boolean isDestroyed() {return false;}

    public ArmorType getType() {
        return type;
    }
    public int getCurrentHealth() {
        return currentHealth;
    }
    public boolean isMagnetic() {
        return isMagnetic;
    }
}
