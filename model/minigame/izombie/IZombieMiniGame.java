package model.minigame.izombie;
import model.minigame.MiniGame;
import model.minigame.MiniGameLevel;
import model.entity.zombie.Zombie;
import model.minigame.MiniGameType;

import java.util.ArrayList;
import java.util.List;

public class IZombieMiniGame extends MiniGame {

    public static final int ROWS              = 5;
    public static final int STARTING_SUN      = 150;
    public static int RED_LINE_COLUMN;


    private int sunAmount;
    private final List<ZombieCard> availableCards;
    private final List<Zombie> activeZombies;
    private final Brain[] brains;

    private boolean isGameOver;
    private boolean isVictory;

    public IZombieMiniGame(MiniGameLevel level) {
        super(level);
        this.sunAmount                 = STARTING_SUN;
        this.availableCards      = new ArrayList<>();
        this.activeZombies       = new ArrayList<>();

        this.brains              = new Brain[ROWS];
        this.isGameOver          = false;
        this.isVictory           = false;

        for (int i = 0; i < ROWS; i++) {
            brains[i] = new Brain(i);
        }
    }
    @Override
    public MiniGameType getType() {
        return MiniGameType.I_ZOMBIE;
    }
    @Override
    protected void initialize() {
    }
}
