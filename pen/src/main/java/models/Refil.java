package models;

public abstract class Refil {
    private Niv niv;
    private RefilType type;
    public Refil(RefilType type){
        this.type=type;
    }

    public RefilType getType() {
        return type;
    }

    public void setType(RefilType type) {
        this.type = type;
    }
//    public abstract void write();
}
