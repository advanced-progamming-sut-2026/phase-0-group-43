package model.entity.strategy;


import model.entity.Entity;

public interface AttackStrategy {
    public void attack(Entity self, Object board);
}
