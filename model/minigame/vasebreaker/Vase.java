package model.minigame.vasebreaker;

public class Vase {
    public static int SEED_PACKET_EXPIRE_TICKS ;
    private VaseType vaseType;
    private VaseContent vaseContent;
    private boolean isBroken;
    private int row;
    private int column;

    public Vase(VaseType vaseType, VaseContent vaseContent, int row, int column) {
        this.vaseType    = vaseType;
        this.vaseContent = vaseContent;
        this.isBroken    = false;
        this.row         = row;
        this.column      = column;
    }

    public VaseContent breakVase() {
        if (isBroken) return null;
        isBroken = true;
        VaseContent released = vaseContent;
        vaseContent = null;
        return released;
    }

    public VaseType getVaseType()    { return vaseType; }
    public boolean isBroken()        { return isBroken; }
    public int getRow()              { return row; }
    public int getColumn()           { return column; }
    public VaseContent peekContent() { return vaseContent; }

}
