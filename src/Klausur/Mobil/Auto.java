package Klausur.Mobil;

public class Auto extends Fahrzeug implements Bremsen, Beschleunigen, Abbiegen {

	private Bremsen bremsType = new Hart();

	private Beschleunigen beschleunigungsType = new Schnell();

	private Abbiegen abbiegeType = new Rechts();

	public void bremsen() {
		this.bremsType.bremsen();
	}

	public void beschleunigen() {
		this.beschleunigungsType.beschleunigen();
	}

	public void abbiegen() {
		this.abbiegeType.abbiegen();
	}
	
}
