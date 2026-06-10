package model.user;

// ChapterType, MiniGameType باید توسط تیم دیگر در enums تعریف شوند
import java.util.Set;
import java.util.HashSet;

public class GameProgress {
    private Set<Object> unlockedChapters;   // enums.ChapterType
    private Set<String> unlockedLevels;
    private Set<Object> unlockedMiniGames;  // enums.MiniGameType
    private Set<String> completedQuests;

    public GameProgress() {
        unlockedChapters = new HashSet<>();
        unlockedLevels = new HashSet<>();
        unlockedMiniGames = new HashSet<>();
        completedQuests = new HashSet<>();
    }

    public void unlockLevel(String id) { }
    public void unlockPlant(String type) { }
}
