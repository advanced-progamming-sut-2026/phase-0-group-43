package controller.game;


import model.game.GameSession;
import model.game.Level;

public class GameController {
    private GameSession currentSession;

    public void startLevel(Level level) {
        currentSession = new GameSession(level);
        currentSession.start();
    }

    public void advanceTime(int ticks) {
        if (currentSession == null) {
            return;
        }

        currentSession.advanceTime(ticks);
    }

    public int getCurrentSun() {
        if (currentSession == null) {
            return 0;
        }

        return currentSession.getSunManager().getCurrentSun();
    }

    public GameSession getCurrentSession() {
        return currentSession;
    }

    public boolean hasActiveSession() {
        return currentSession != null;
    }
}