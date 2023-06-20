package Entwurfsmuster.Factory.Schuhfabrik.KonkreteSchuhe;

import Entwurfsmuster.Factory.Schuhfabrik.interfaces.IWanderSchuh;

public class PumaWanderSchuh implements IWanderSchuh {
    public String print() {
        return "Puma Wander Schuh";
    }
}