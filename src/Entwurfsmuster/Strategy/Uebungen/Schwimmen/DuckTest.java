package Entwurfsmuster.Strategy.Uebungen.Schwimmen;

public class DuckTest {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.setFlyType(new Hoch());
		mallard.setQuackType(new Quaken());
		mallard.setSwimType(new Calm());
		mallard.swim();
		mallard.display();
	}

}
