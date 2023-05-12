package Entwurfsmuster.Strategy.Beispiele.DuckSimStart;

public class MallardDuck extends Duck {

	@Override
	public void display() {
		System.out.println("I am a Mallard duck.");
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
