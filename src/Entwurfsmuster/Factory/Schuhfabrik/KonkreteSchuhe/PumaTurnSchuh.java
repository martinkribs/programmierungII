package Entwurfsmuster.Factory.Schuhfabrik.KonkreteSchuhe;

import Entwurfsmuster.Factory.Schuhfabrik.interfaces.ITurnSchuh;

public class PumaTurnSchuh implements ITurnSchuh {
    public String print() {
        return "Puma Turn Schuh";
    }
}