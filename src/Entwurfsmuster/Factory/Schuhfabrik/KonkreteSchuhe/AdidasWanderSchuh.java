package Entwurfsmuster.Factory.Schuhfabrik.KonkreteSchuhe;

import Entwurfsmuster.Factory.Schuhfabrik.interfaces.IWanderSchuh;

public class AdidasWanderSchuh implements IWanderSchuh {
    public String print() {
        return "Adidas Wander Schuh";
    }
}