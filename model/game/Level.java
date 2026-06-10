package model.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Level {
    private final int id;
    private final String name;
    private final LevelType levelType;
    private final List<Wave> waves;
    private int initialSun;
    private boolean unlocked;

    public Level(int id, String name, LevelType levelType, int initialSun) {
        this.id = id;
        this.name = name;
        this.levelType = levelType;
        this.initialSun = initialSun;
        this.unlocked = false;
        this.waves = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LevelType getLevelType() {
        return levelType;
    }

    public int getInitialSun() {
        return initialSun;
    }

    public void setInitialSun(int initialSun) {
        this.initialSun = initialSun;
    }

    public boolean isUnlocked() {
        return unlocked;
    }

    public void unlock() {
        unlocked = true;
    }

    public List<Wave> getWaves() {
        return Collections.unmodifiableList(waves);
    }

    public void addWave(Wave wave) {
        if (wave != null) {
            waves.add(wave);
        }
    }
}