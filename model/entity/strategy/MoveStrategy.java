package model.entity.strategy;


import model.entity.zombie.Zombie;

public interface MoveStrategy {
    public void move(Zombie self, Object board);
}
