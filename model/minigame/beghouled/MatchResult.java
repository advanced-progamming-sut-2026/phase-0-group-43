package model.minigame.beghouled;
import model.entity.plant.Plant;

import java.util.List;

public class MatchResult {
     private final List<Plant> matchedPlants;
     private final int matchSize;
     private final boolean isCascade;

     public MatchResult(List<Plant> matchedPlants, boolean isCascade) {
          this.matchedPlants = matchedPlants;
          this.matchSize     = matchedPlants.size();
          this.isCascade     = isCascade;
     }
}
