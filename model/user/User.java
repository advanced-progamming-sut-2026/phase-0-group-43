package model.user;

import enums.Gender;
import java.util.List;
import java.util.Set;

public class User {
    private String username;
    private String passwordHash;
    private String nickname;
    private String email;
    private Gender gender;
    //private int coins;
    //private int gems;
    private int maxMioPoints;
    private int gamesPlayed;
    private List<String> unlockedPlants;
    private Set<String> readNewsIds;
    private MiniGameProgress miniGameProgress;

    // Composition (طبق UML)
    private Profile profile;
    private Wallet wallet;
    private GameProgress progress;

    public void saveToFile() {
    }

    public MiniGameProgress getMiniGameProgress() {
        return miniGameProgress;
    }
}
