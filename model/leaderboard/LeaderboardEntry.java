package model.leaderboard;

public class LeaderboardEntry {
    private String username;
    private String lastChapter;
    private int lastLevel;
    private int miniGameWins;
    private int dailyQuestsCompleted;
    private int nonDailyQuestsCompleted;
    private int highestMioPoints;

    public LeaderboardEntry(String username, String lastChapter, int lastLevel,
                            int miniGameWins, int dailyQuestsCompleted,
                            int nonDailyQuestsCompleted, int highestMioPoints) {
        this.username = username;
        this.lastChapter = lastChapter;
        this.lastLevel = lastLevel;
        this.miniGameWins = miniGameWins;
        this.dailyQuestsCompleted = dailyQuestsCompleted;
        this.nonDailyQuestsCompleted = nonDailyQuestsCompleted;
        this.highestMioPoints = highestMioPoints;
    }
}
