package services.strategies.refilwritestrategy.factory;

import models.RefilType;
import services.strategies.refilwritestrategy.BallPenRefilWriteStrategy;
import services.strategies.refilwritestrategy.GelPenRefilWriteStrategy;
import services.strategies.refilwritestrategy.RefilWriteStrategy;

public class RefilPenWriteStrategyFactory {
    public static RefilWriteStrategy getWriteStrategyForType(RefilType type){
        if(type.equals(RefilType.BALL))
            return new BallPenRefilWriteStrategy();
        else if(type.equals(RefilType.GEL))
            return  new GelPenRefilWriteStrategy();
        return  null;
    }
}
