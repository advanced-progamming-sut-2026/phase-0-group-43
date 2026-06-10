package model.map;

import model.Plant;
import model.Zombie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tile {
    private final Position position;
    private TileType tileType;
    private Plant plant;
    private final List<Zombie> zombies;

    public Tile(Position position, TileType tileType){
        this.position = position;
        this.tileType = tileType;
        this.zombies = new ArrayList<>();
    }
    public Position getPosition(){
        return position;
    }
    public TileType getTileType(){
        return tileType;
    }
    public void setTileType(TileType tileType){
        this.tileType = tileType;
    }
    public Plant getPlant() {
        return plant;
    }

    public boolean hasPlant() {
        return plant != null;
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    public void removePlant() {
        this.plant = null;
    }

    public boolean hasZombies() {
        return !zombies.isEmpty();
    }
    public List<Zombie> getZombies() {
        return Collections.unmodifiableList(zombies);
    }

    public void addZombie(Zombie zombie) {
        if (zombie != null) {
            zombies.add(zombie);
        }
    }

    public void removeZombie(Zombie zombie) {
        zombies.remove(zombie);
    }

    public boolean isPlantable() {
        return tileType == TileType.NORMAL && plant == null;
    }

    @Override
    public String toString() {
        return "Tile " + position + " type=" + tileType;
    }
}
