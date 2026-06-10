package model.map;

import java.util.Objects;

public class Position {
    private final int x;
    private final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Position withX(int newX) {
        return new Position(newX, y);
    }

    public Position withY(int newY) {
        return new Position(x, newY);
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Position)) {
            return false;
        }
        Position position = (Position) object;
        return (x == position.x && y == position.y);
    }

    @Override
    public int hashCode(){
        return Objects.hash(x, y);
    }

    @Override
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
