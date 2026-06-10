package model.minigame;

public class MiniGameLevel {
    private final MiniGameType miniGameType;
    private final int levelNumber;
    private final int difficulty;
    private final int boardRows;
    private final int boardColumns;
    private final int initialSun;
    private boolean unlocked;
    private String description;

    public MiniGameLevel(MiniGameType miniGameType, int levelNumber, int difficulty, int boardRows, int boardColumns, int initialSun) {
        this.miniGameType = miniGameType;
        this.levelNumber = levelNumber;
        this.difficulty = difficulty;
        this.boardRows = boardRows;
        this.boardColumns = boardColumns;
        this.initialSun = initialSun;
        this.unlocked = false;
        this.description = "";
    }

    public MiniGameType getMiniGameType() {
        return miniGameType;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public int getBoardRows() {
        return boardRows;
    }

    public int getBoardColumns() {
        return boardColumns;
    }

    public int getInitialSun() {
        return initialSun;
    }

    public boolean isUnlocked() {
        return unlocked;
    }

    public void unlock() {
        unlocked = true;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}