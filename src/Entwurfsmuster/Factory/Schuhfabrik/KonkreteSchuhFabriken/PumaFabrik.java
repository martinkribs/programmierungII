package Entwurfsmuster.Factory.Schuhfabrik.KonkreteSchuhFabriken;

import Entwurfsmuster.Factory.Schuhfabrik.interfaces.ISchuhFabrik;
import Entwurfsmuster.Factory.Schuhfabrik.KonkreteSchuhe.PumaTurnSchuh;
import Entwurfsmuster.Factory.Schuhfabrik.KonkreteSchuhe.PumaWanderSchuh;
import Entwurfsmuster.Factory.Schuhfabrik.interfaces.ISchuh;

public class PumaFabrik implements ISchuhFabrik {
    
    @Override
    public ISchuh createSchuh(String name) {
        if(name.equals("Wander")) {
            return new PumaWanderSchuh();
        } else if(name.equals("Turn")) {
            return new PumaTurnSchuh();
        } else {
            return null;
        }
        
    }
}