package Entwurfsmuster.Strategy.Beispiele.DuckSimStart;

public class RubberDuck extends Duck {

	@Override
	public void display() {
		System.out.println("This is a toy duck made of rubber.");
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
