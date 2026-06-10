package model.minigame.zombotany;

import model.minigame.MiniGame;
import model.minigame.MiniGameLevel;
import model.entity.zombie.Zombie;
import model.minigame.MiniGameType;

import java.util.List;

public class ZombotanyMiniGame extends MiniGame {
    List<Zombie> zombieList;
    @Override
    public MiniGameType getType() {
        return MiniGameType.ZOMBOTANY;
    }

    @Override
    protected void initialize() {
    }

    public ZombotanyMiniGame(MiniGameLevel level) {
        super(level);
    }
}
