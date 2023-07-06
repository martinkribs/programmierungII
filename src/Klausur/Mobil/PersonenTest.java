package Klausur.Mobil;

import Entwurfsmuster.Strategy.Uebungen.Duck.Quietschen;
import Entwurfsmuster.Strategy.Uebungen.Duck.RubberDuck;
import Entwurfsmuster.Strategy.Uebungen.Duck.Tief;

public class PersonenTest {

	public static void main(String[] args) {
		Auto auto = new Auto();
		Person peter = new Person("Peter");
		peter.setFahrzeug(auto);
		peter.fahren();
		peter.bremsen();

		Fahrrad fahrrad = new Fahrrad();
		peter.setFahrzeug(fahrrad);
		fahrrad.beschleunigen();
		fahrrad.abbiegen();
	}

}
