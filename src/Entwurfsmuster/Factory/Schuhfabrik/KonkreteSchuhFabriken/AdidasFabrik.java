package Entwurfsmuster.Factory.Schuhfabrik.KonkreteSchuhFabriken;

import Entwurfsmuster.Factory.Schuhfabrik.interfaces.ISchuhFabrik;
import Entwurfsmuster.Factory.Schuhfabrik.KonkreteSchuhe.AdidasTurnSchuh;
import Entwurfsmuster.Factory.Schuhfabrik.KonkreteSchuhe.AdidasWanderSchuh;
import Entwurfsmuster.Factory.Schuhfabrik.interfaces.ISchuh;

public class AdidasFabrik implements ISchuhFabrik {
    
    @Override
    public ISchuh createSchuh(String name) {
        switch (name) {
            case "Wander":
            case "Wanderschuh":
            case "W":
                return new AdidasWanderSchuh();
            case "Turn":
                return new AdidasTurnSchuh();
            default:
                throw new IllegalArgumentException("Schuhname nicht bekannt");
        }
        // if(name.contains("Wander")) {
        //     return new AdidasWanderSchuh();
        // } else if(name.contains("Turn")) {
        //     return new AdidasTurnSchuh();
        // } else {
        //     return null;
        // }
        
    }
}