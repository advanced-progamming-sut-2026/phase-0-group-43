package model.entity.plant;

import model.entity.EntityFactory;
import model.entity.strategy.*;
import model.entity.zombie.Zombie;
import model.entity.zombie.ZombieConfig;

import static model.entity.Configs.plantTypePlantConfigHashMap;
import static model.entity.Configs.zombieTypeZombieConfigHashMap;

public class PlantFactory extends EntityFactory<Plant, PlantName> {
    @Override
    public Plant create(PlantName plantName) {
        PlantConfig config = plantTypePlantConfigHashMap.get(plantName);
        AttackStrategy attackStrategy = switch (config.getType()){
            case SUN_PRODUCER -> null;
            case SHOOTERS -> new ShootPeaStrategy();
            case LOBBERS -> new LobStrategy();
            case EXPLOSIVES -> new ExplodeStrategy();
            case MELEE_ATTACKERS -> new MeleeAttackStrategy();
            case WALL_NUTS -> null;
            case MODIFIER -> null;
            case STRIKE_THROUGH -> null;
            case HOMING -> null;
            case MINT -> null;
        };

        return new Plant(config, attackStrategy);
    }
}