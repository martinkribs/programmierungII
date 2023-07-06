package Klausur.Mobil;

public class Fahrrad implements Bremsen, Beschleunigen, Abbiegen {

	private Bremsen bremsType= new Hart();

	private Beschleunigen beschleunigungsType = new Langsam();

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
