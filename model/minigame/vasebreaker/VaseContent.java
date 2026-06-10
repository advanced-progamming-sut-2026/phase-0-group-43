package model.minigame.vasebreaker;
import model.entity.plant.SeedPacket;
import model.entity.zombie.Zombie;

public class VaseContent {
     private Zombie zombie;
     private SeedPacket seedPacket;
     private boolean isEmpty;
     VaseType vaseType;
     public VaseContent() {
          this.isEmpty = true;
     }

     public VaseContent(Zombie zombie) {
          this.zombie = zombie;
          this.isEmpty = false;
     }

     public VaseContent(SeedPacket seedPacket) {
          this.seedPacket = seedPacket;
          this.isEmpty = false;
     }
}
