package model.minigame.vasebreaker;

import model.minigame.MiniGame;
import model.minigame.MiniGameLevel;
import model.entity.plant.SeedPacket;
import model.entity.zombie.Zombie;
import model.minigame.MiniGameType;

import java.util.ArrayList;
import java.util.List;

public class VasebreakerMiniGame extends MiniGame {
    private List<Vase> vases;
    private List<SeedPacket> groundSeedPackets;
    private final List<Zombie> activeZombies;

    public VasebreakerMiniGame(MiniGameLevel level) {
        super(level);
        this.vases             = new ArrayList<>();
        this.groundSeedPackets = new ArrayList<>();
        this.activeZombies     = new ArrayList<>();

    }
    @Override
    public MiniGameType getType() {
        return MiniGameType.VASEBREAKER;
    }

    @Override
    protected void initialize() {
    }

    public VaseContent breakVase(int row, int column){
        return null;
    }
    public SeedPacket collectGroundSeedPacket(int row, int column){return null;}
}
