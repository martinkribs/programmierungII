package Entwurfsmuster.Strategy.Beispiele.DuckSimStart;

public abstract class Duck implements Flyable,Quackable{
	
	public void swim() {
		System.out.println("Swimming");
	}
	
	public abstract void display();
}
