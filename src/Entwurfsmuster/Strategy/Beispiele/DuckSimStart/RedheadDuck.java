package Entwurfsmuster.Strategy.Beispiele.DuckSimStart;

public class RedheadDuck extends Duck{

	@Override
	public void display() {
		System.out.println("I am a Redhead duck.");

	}

	@Override
	public void quack() {
		System.out.println("Squeaking");
	}

	@Override
	public void fly() {
		System.out.println("Fly");
	}

}
