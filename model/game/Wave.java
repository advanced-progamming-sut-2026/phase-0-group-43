package model.game;

import model.Zombie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Wave {
    private final int number;
    private final int difficulty;
    private final boolean finalWave;
    private final List<Zombie> zombies;

    public Wave(int number, int difficulty, boolean finalWave) {
        this.number = number;
        this.difficulty = difficulty;
        this.finalWave = finalWave;
        this.zombies = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public boolean isFinalWave() {
        return finalWave;
    }

    public List<Zombie> getZombies() {
        return Collections.unmodifiableList(zombies);
    }

    public void addZombie(Zombie zombie) {
        if (zombie != null) {
            zombies.add(zombie);
        }
    }
}
