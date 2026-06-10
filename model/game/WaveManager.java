package model.game;

import java.util.ArrayList;
import java.util.List;

public class WaveManager {
    private final List<Wave> waves;
    private int currentWaveIndex;

    public WaveManager(List<Wave> waves) {
        this.waves = waves;
        this.currentWaveIndex = -1;
    }

    public boolean hasNextWave() {
        return waves != null && currentWaveIndex + 1 < waves.size();
    }

    public Wave startNextWave() {
        if (!hasNextWave()) return null;
        currentWaveIndex++;
        return waves.get(currentWaveIndex);
    }

    public Wave getCurrentWave() {
        if (waves == null || currentWaveIndex < 0 || currentWaveIndex >= waves.size()) {
            return null;
        }
        return waves.get(currentWaveIndex);
    }

    public boolean isFinalWaveStarted() {
        Wave currentWave = getCurrentWave();
        return (currentWave != null && currentWave.isFinalWave());
    }

    public int getCurrentWaveNumber() {
        Wave currentWave = getCurrentWave();
        if (currentWave == null) return 0;
        return currentWave.getNumber();
    }
}
