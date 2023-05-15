package Entwurfsmuster.Strategy.Uebungen.Schwimmen;

public abstract class Duck implements Quackable, Flyable, Swimmable {

	private Quackable quackType;

	private Flyable flyType;

	private Swimmable swimType;

	public void setQuackType(Quackable quackType) {
		this.quackType = quackType;
	}

	public void setFlyType(Flyable flyType) { this.flyType = flyType; }

	public void setSwimType(Swimmable swimType) {
		this.swimType = swimType;
	}

	public void quack() {
		this.quackType.quack();
	}

	public void fly() {
		this.flyType.fly();
	}

	public void swim(){this.swimType.swim();}

	public abstract void display();
	
}
