package model.minigame.beghouled;
import model.minigame.MiniGame;
import model.minigame.MiniGameLevel;
import model.entity.plant.Plant;
import model.entity.zombie.Zombie;
import model.minigame.MiniGameType;

import java.util.ArrayList;
import java.util.List;

public class BeghouledMiniGame extends MiniGame {
     private static final int[] WIN_MATCH_COUNT = {3, 5, 7};

     private final int rows;
     private final int cols;

     private final List<Zombie> activeZombies;
     private final Plant[][] grid;
     private final List<PlantUpgradeOption> availableUpgrades;

     private boolean[][] craterCells;

     private int sun;
     private int matchesMade;
     private final int targetMatches;

     private boolean isGameOver;
     private boolean isVictory;

     public BeghouledMiniGame(MiniGameLevel level, int rows, int cols) {
          super(level);
          this.rows = rows;
          this.cols = cols;
          this.grid              = new Plant[rows][cols];
          this.activeZombies     = new ArrayList<>();
          this.availableUpgrades = new ArrayList<>();
          this.sun               = 0;
          this.matchesMade       = 0;
          int index = Math.max(0, Math.min(WIN_MATCH_COUNT.length - 1, level.getLevelNumber() - 1));
          this.targetMatches = WIN_MATCH_COUNT[index];
          this.isGameOver        = false;
          this.isVictory         = false;
     }
     @Override
     public MiniGameType getType() {
          return MiniGameType.BEGHOULED;
     }

     @Override
     protected void initialize() {
     }
}
