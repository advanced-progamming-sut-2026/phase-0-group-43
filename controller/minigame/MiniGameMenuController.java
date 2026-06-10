package controller.minigame;

import model.minigame.MiniGameLevel;
import model.minigame.MiniGameType;

public class MiniGameMenuController {

    private MiniGameType selectedGame;
    private MiniGameLevel selectedLevel;

    public void showMiniGames() {
    }

    public void selectMiniGame(MiniGameType type) {
        this.selectedGame = type;
    }

    public void selectLevel(MiniGameLevel level) {
        this.selectedLevel = level;
    }

    public void startMiniGame() {
    }

    public MiniGameType getSelectedGame() {
        return selectedGame;
    }

    public MiniGameLevel getSelectedLevel() {
        return selectedLevel;
    }
}