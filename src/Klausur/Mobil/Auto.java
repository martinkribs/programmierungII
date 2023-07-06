package Klausur.Mobil;

public class Auto extends Fahrzeug {
	Auto(){
		super.setAbbiegeType(new Rechts());
		super.setBremsType(new Hart());
		super.setBeschleunigungsType(new Schnell());
	}
}
