<<<<<<<< HEAD:src/Entwurfsmuster/Decorator/Beispiele/One/TestCoffees.java
package Entwurfsmuster.Decorator.Beispiele.One;

public class TestCoffees {
	public static void main(String[] args) {
		Beverage dr = new DarkRoast();
		dr.addCondiment(new Schoko());
		System.out.println(dr.exportDescription());
		System.out.println(dr.cost());

		Beverage hb = new HouseBlend();
		hb.addCondiment(new Milch());
		hb.addCondiment(new Schoko());
		hb.getCondiments().removeIf(condiment -> condiment instanceof Milch);
		hb.addCondiment(new Sahne());
		System.out.println(hb.exportDescription());
		System.out.println(hb.cost());
	}

}
========
package Entwurfsmuster.Decorator.Beispiele.KaffeeStrategie;

public class TestCoffees {
	public static void main(String[] args) {
		Beverage dr = new DarkRoast();
		dr.addCondiment(new Schoko());
		System.out.println(dr.exportDescription());
		System.out.println(dr.cost());

		Beverage hb = new HouseBlend();
		hb.addCondiment(new Milch());
		hb.addCondiment(new Schoko());
		hb.getCondiments().removeIf(condiment -> condiment instanceof Milch);
		hb.addCondiment(new Sahne());
		System.out.println(hb.exportDescription());
		System.out.println(hb.cost());
	}

}
>>>>>>>> 1ec590e0e99b902a666672f929c601c5d3d0f1d1:src/Entwurfsmuster/Decorator/Beispiele/KaffeeStrategie/TestCoffees.java
