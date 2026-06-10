package model.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chapter {
    private final int id;
    private final String name;
    private final List<Level> levels;

    public Chapter(int id, String name) {
        this.id = id;
        this.name = name;
        this.levels = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Level> getLevels() {
        return Collections.unmodifiableList(levels);
    }

    public void addLevel(Level level) {
        if (level != null) {
            levels.add(level);
        }
    }
}
