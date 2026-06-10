package model.minigame.bowling;
import model.minigame.MiniGame;
import model.minigame.MiniGameLevel;
import model.entity.zombie.Zombie;
import model.minigame.MiniGameType;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BowlingWallnutMiniGame extends MiniGame {
    public static final int RED_LINE_COLUMN = 3;

    private final int rows;
    private final int cols;

    private final List<BowlingNut> activeNuts;
    private final List<Zombie> activeZombies;
    private final Queue<BowlingNut> conveyorBelt;

    private boolean isGameOver;
    private boolean isVictory;

    public BowlingWallnutMiniGame(MiniGameLevel level, int rows, int cols) {
        super(level);
        this.rows = rows;
        this.cols = cols;
        this.activeNuts     = new ArrayList<>();
        this.activeZombies  = new ArrayList<>();
        this.conveyorBelt   = new LinkedList<>();
        this.isGameOver     = false;
        this.isVictory      = false;
    }
    @Override
    public MiniGameType getType() {
        return MiniGameType.BOWLING_WALLNUT;
    }

    @Override
    protected void initialize() {
    }
}
