package model.minigame;

public abstract class MiniGame {
    protected MiniGameLevel level;
    protected static final int[] WIN_MATCH_COUNT = { 10, 20, 35 };


    public MiniGame(MiniGameLevel level) {
        this.level = level;
    }

    public abstract MiniGameType getType();
    protected abstract void initialize();
}
