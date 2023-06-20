package Entwurfsmuster.Factory.Schuhfabrik.KonkreteSchuhe;

import Entwurfsmuster.Factory.Schuhfabrik.interfaces.ITurnSchuh;

public class AdidasTurnSchuh implements ITurnSchuh {
    public String print() {
        return "Adidas Turnschuh können du laufen schell :O";
    }
}