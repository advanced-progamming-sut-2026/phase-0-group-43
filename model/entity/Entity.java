package model.entity;

public abstract class Entity {
    private String name;
    protected int health;
    private int maxHealth;
    protected int x;
    protected int y;

    public abstract void onTick(Object board);

    public void takeDamage(int damage) {}

    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getMaxHealth() { return maxHealth; }
    public int getX() { return x; }
    public int getY() { return y; }
}