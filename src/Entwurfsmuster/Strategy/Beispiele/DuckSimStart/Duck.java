package Entwurfsmuster.Strategy.Beispiele.DuckSimStart;

public abstract class Duck implements Quackable, Flyable {

	private Quackable quackType;

	private Flyable flyType;

	public void swim() {
		System.out.println("Swimming");
	}

	public void setQuackType(Quackable quackType) {
		this.quackType = quackType;
	}

	public void setFlyType(Flyable flyType) {
		this.flyType = flyType;
	}

	public void quack() {
		this.quackType.quack();
	}

	public void fly() {
		this.flyType.fly();
	}

	public abstract void display();
	
}
