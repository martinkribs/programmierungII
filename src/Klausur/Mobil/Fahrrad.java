package Klausur.Mobil;

public class Fahrrad extends Fahrzeug {

    Fahrrad(){
        super.setAbbiegeType(new Rechts());
        super.setBremsType(new Hart());
        super.setBeschleunigungsType(new Langsam());
    }
	
}
