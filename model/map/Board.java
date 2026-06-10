package model.map;

import java.util.ArrayList;
import java.util.List;

public class Board {
    public static final int DEFAULT_ROWS = 5;
    public static final int DEFAULT_COLUMNS = 9;

    private final int rows;
    private final int columns;
    private final Tile[][] tiles;
    private final List<LawnMower> lawnMowers;

    public Board() {
        this(DEFAULT_ROWS, DEFAULT_COLUMNS);
    }

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.tiles = new Tile[rows][columns];
        this.lawnMowers = new ArrayList<>();

        initializeTiles();
        initializeLawnMowers();
    }

    private void initializeTiles() {
        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < columns; x++) {
                tiles[y][x] = new Tile(new Position(x + 1, y + 1), TileType.NORMAL);
            }
        }
    }

    private void initializeLawnMowers() {
        for (int row = 1; row <= rows; row++) {
            lawnMowers.add(new LawnMower(row));
        }
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public boolean isInside(Position position) {
        if (position == null) {
            return false;
        }

        int x = position.getX();
        int y = position.getY();

        return x >= 1 && x <= columns && y >= 1 && y <= rows;
    }

    public Tile getTile(Position position) {
        if (!isInside(position)) {
            return null;
        }
        return tiles[position.getY() - 1][position.getX() - 1];
    }

    public List<LawnMower> getLawnMowers() {
        return lawnMowers;
    }

    public LawnMower getLawnMowerByRow(int row) {
        if (row < 1 || row > rows) {
            return null;
        }

        return lawnMowers.get(row - 1);
    }
}
