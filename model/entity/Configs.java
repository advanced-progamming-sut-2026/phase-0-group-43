package model.entity;

import model.entity.plant.PlantConfig;
import model.entity.plant.PlantName;
import model.entity.plant.PlantType;
import model.entity.zombie.Zombie;
import model.entity.zombie.ZombieConfig;
import model.entity.zombie.ZombieType;

import java.util.HashMap;

public class Configs {
    public static HashMap<ZombieType, ZombieConfig> zombieTypeZombieConfigHashMap;
    public static HashMap<PlantName, PlantConfig> plantTypePlantConfigHashMap;
}
//Configs.zombieTypeZombieConfigHashMap = ZombieDataLoader.load("zombies.json");
//this should be called at the beggening of the game
