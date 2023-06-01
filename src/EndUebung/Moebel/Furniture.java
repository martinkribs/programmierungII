package EndUebung.Moebel;

public abstract class Furniture {
    protected String description;
	
	public abstract double cost();

	public String getDescription() {
		return description;
	}
}
