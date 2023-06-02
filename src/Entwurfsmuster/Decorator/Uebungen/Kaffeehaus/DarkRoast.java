package Entwurfsmuster.Decorator.Uebungen.Kaffeehaus;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		super("Hervorragende dunkle Röstung", 2.99);
	}

	public double cost(){
		return 1.99 + super.cost();
	}
}
