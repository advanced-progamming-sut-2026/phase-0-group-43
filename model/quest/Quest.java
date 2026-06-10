package model.quest;

public class Quest {
    private String id;
    private String description;
    private QuestType type;
    private QuestPriority priority;
    private int currentProgress;
    private int targetProgress;
    private Reward reward;
    private boolean isCompleted;

    public Quest(String id, String description, QuestType type,
                 QuestPriority priority, int targetProgress, Reward reward) {
        this.id = id;
        this.description = description;
        this.type = type;
        this.priority = priority;
        this.targetProgress = targetProgress;
        this.reward = reward;
        this.currentProgress = 0;
        this.isCompleted = false;
    }

    public void addProgress(int amount) {
    }

}
