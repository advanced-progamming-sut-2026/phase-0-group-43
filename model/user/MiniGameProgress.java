package model.user;

import model.minigame.MiniGameType;

import java.util.*;

public class MiniGameProgress {

    private Set<MiniGameType> unlockedMiniGames;

    private Map<MiniGameType, Set<Integer>> completedLevels;

    private int successfulMiniGames;

    public MiniGameProgress() {
        unlockedMiniGames = new HashSet<>();
        completedLevels = new HashMap<>();
    }

    public void unlockMiniGame(MiniGameType type) {
        unlockedMiniGames.add(type);
    }

    public boolean isUnlocked(MiniGameType type) {
        return unlockedMiniGames.contains(type);
    }

    public void completeLevel(MiniGameType type, int level) {

        completedLevels
                .computeIfAbsent(type, t -> new HashSet<>())
                .add(level);
    }

    public int getSuccessfulMiniGames() {
        return successfulMiniGames;
    }

    public void incrementSuccessfulMiniGames() {
        successfulMiniGames++;
    }

    public Set<MiniGameType> getUnlockedMiniGames() {
        return unlockedMiniGames;
    }
}