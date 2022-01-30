package models.pens;

import models.Color;
import models.Niv;
import models.Refil;
import models.RefilType;
import services.strategies.refilwritestrategy.factory.RefilPenWriteStrategyFactory;

public class RefilPen implements  Pen{
    private Refil refil;

    public  RefilPen(Refil refil){
        this.refil=refil;
    }
    @Override
    public void write() {
        RefilPenWriteStrategyFactory
                .getWriteStrategyForType(refil.getType())
                .write();
    }

    @Override
    public Color getColor() {
        return null;
    }
}
