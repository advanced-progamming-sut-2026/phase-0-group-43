package model.game;

import model.map.Board;

public class GameSession{

    private final Level level;
    private final Board board;
    private final SunManager sunManager;
    private final WaveManager waveManager;
    private GameState gameState;
    private int elapsedTicks;
    private int plantFoodCount;



    public GameSession(Level level){
        this.level = level;
        this.board = new Board();
        this.sunManager = new SunManager(level.getInitialSun());
        this.waveManager = new WaveManager(level.getWaves());
        this.gameState = GameState.NOT_STARTED;
        this.elapsedTicks = 0;
        this.plantFoodCount = 0;
    }
    public void start() {
        gameState = GameState.RUNNING;
    }

    public void advanceTime(int ticks) {
        if (gameState != GameState.RUNNING || ticks <= 0) {
            return;
        }

        elapsedTicks += ticks;
    }

    public Level getLevel() {
        return level;
    }

    public Board getBoard() {
        return board;
    }

    public SunManager getSunManager() {
        return sunManager;
    }

    public WaveManager getWaveManager() {
        return waveManager;
    }

    public GameState getGameState() {
        return gameState;
    }

    public int getElapsedTicks() {
        return elapsedTicks;
    }

    public double getElapsedSeconds() {
        return elapsedTicks / 10.0;
    }

    public int getPlantFoodCount() {
        return plantFoodCount;
    }

//    public void addPlantFood() {
//        if (plantFoodCount < 3) {
//            plantFoodCount++;
//        }
//    }

//    public boolean usePlantFood() {
//        if (plantFoodCount <= 0) {
//            return false;
//        }

//        plantFoodCount--;
//        return true;
//    }
}
