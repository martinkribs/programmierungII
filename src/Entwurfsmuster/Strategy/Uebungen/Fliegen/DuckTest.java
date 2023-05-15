package Entwurfsmuster.Strategy.Uebungen.Fliegen;

public class DuckTest {

	public static void main(String[] args) {
		Duck rubberDuck = new RubberDuck();
		rubberDuck.setFlyType(new Raketenantrieb());
		rubberDuck.setQuackType(new Quietschen());
		rubberDuck.quack();
		rubberDuck.display();
		rubberDuck.fly();
	}

}
