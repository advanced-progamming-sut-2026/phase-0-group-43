package model.entity.zombie;

import model.entity.Configs;
import model.entity.EntityFactory;
import model.entity.strategy.*;

import static model.entity.Configs.zombieTypeZombieConfigHashMap;

public class ZombieFactory extends EntityFactory<Zombie, ZombieType> {
    @Override
    public Zombie create(ZombieType zombieType) {
        ZombieConfig config = zombieTypeZombieConfigHashMap.get(zombieType);
        MoveStrategy move  = switch (zombieType){
            case DODO_RIDER -> new FlyStrategy();
            case TROGLOBITE -> new DiagonalSlideStrategy();
            default         -> new WalkStrategy();
        };
        AttackStrategy attackStrategy = switch (zombieType){
            case WIZARD -> new TurnToCat();
            default -> new EatPlant();
        };

        return new Zombie(config, move, attackStrategy);
    }

}