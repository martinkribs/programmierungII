package Entwurfsmuster.Strategy.Beispiele.DuckSimStart;

public abstract class Duck {

	public void swim() {
		System.out.println("Swimming");
	}

	public void quack() {
	}

	public void fly() {
	}

	public abstract void display();
	
}
