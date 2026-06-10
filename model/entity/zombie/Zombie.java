package model.entity.zombie;

import model.entity.Entity;
import model.entity.strategy.AttackStrategy;
import model.entity.strategy.MoveStrategy;

import java.util.ArrayList;
import java.util.List;

public class Zombie extends Entity {

    protected ZombieType type;
    protected int speed;
    protected int damage;
    protected int waveCost;
    protected int freezeTicksLeft;
    protected boolean isGlowing;
    protected int row;
    protected List<Armor> armors;
    protected List<Effects> effects;
    protected MoveStrategy moveStrategy;
    protected AttackStrategy attackStrategy;

    public Zombie(ZombieConfig zombieConfig, MoveStrategy move, AttackStrategy attackStrategy){
        this.type           = zombieConfig.getType();
        this.health         = zombieConfig.getHitPoints();
        this.speed          = (int) zombieConfig.getSpeed();
        this.moveStrategy   = move;
        this.attackStrategy = attackStrategy;
        this.armors = new ArrayList<>();
        for (ArmorType armorType : zombieConfig.getArmors()) {
            this.armors.add(new Armor(armorType));
        }
    }

    @Override
    public void onTick(Object board) {
        moveStrategy.move(this, board);
        attackStrategy.attack(this, board);
    }

    public void takeDamage(int dmg, DamageType type) {}

    public boolean isDead() { return false; }
}