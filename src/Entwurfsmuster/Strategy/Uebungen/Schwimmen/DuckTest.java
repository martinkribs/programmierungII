package Entwurfsmuster.Strategy.Uebungen.Schwimmen;

public class DuckTest {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.setFlyType(new Hoch());
		mallard.setQuackType(new Quaken());
		mallard.swim();
		mallard.display();

		Duck rubberDuck = new RubberDuck();
		rubberDuck.setFlyType(new Tief());
		rubberDuck.setQuackType(new Quietschen());
		rubberDuck.quack();
		rubberDuck.display();
		rubberDuck.fly();
	}

}
