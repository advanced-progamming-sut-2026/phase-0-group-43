package model.collection;

import model.entity.plant.PlantName;
import model.entity.zombie.ZombieType;

import java.util.HashSet;
import java.util.Set;

public class Collection {
    private Set<PlantName> unlockedPlants = new HashSet<>();
    private Set<ZombieType> seenZombies = new HashSet<>();
    private Set<PlantName> lockedPlants = new HashSet<>();

    public void unlockPlant(PlantName name) {}
    public void addSeenZombie(ZombieType type) {}

    public boolean hasPlant(PlantName name) { return false; }
    public boolean hasSeen(ZombieType type) { return false; }
}