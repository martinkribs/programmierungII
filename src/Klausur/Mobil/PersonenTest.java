package Klausur.Mobil;

import Entwurfsmuster.Strategy.Uebungen.Duck.Quietschen;
import Entwurfsmuster.Strategy.Uebungen.Duck.RubberDuck;
import Entwurfsmuster.Strategy.Uebungen.Duck.Tief;

public class PersonenTest {

	public static void main(String[] args) {
		Auto auto = new Auto();
		Fahrrad fahrrad = new Fahrrad();
		System.out.print("Peter fährt Auto und es ");
		auto.beschleunigen();
		auto.bremsen();
		System.out.print("Peter fährt Fahrrad und es ");
		fahrrad.beschleunigen();
		fahrrad.abbiegen();
	}

}
