package Entwurfsmuster.Observer.Beispiele.RadioBroadcast;

import java.util.EventObject;

// alle Ereignisklassen erweitern diese Java-Basisklasse
public class AdEvent extends EventObject {
	
	private String slogan;

	// source: Ereignisausl�ser
	public AdEvent(Object source, String slg) {
		super(source);
		this.slogan = slg;
	}

	public String getSlogan() {
		return slogan;
	}

}
