<<<<<<<< HEAD:src/Entwurfsmuster/Decorator/Beispiele/One/Beverage.java
package Entwurfsmuster.Decorator.Beispiele.One;

import java.util.ArrayList;
import java.util.List;

public abstract class Beverage {
	
	protected String description;
	protected double price;
	private List<Zutat> condiments = new ArrayList<>();	

	public Beverage(String description, double price) {
		this.description = description;
		this.price = price;
	}

	public void addCondiment(Zutat condiment) {
		condiments.add(condiment);
	}

	public void removeCondimentBeforeAdded(Zutat condiment) {
		condiments.remove(condiment);
	}

	public List<Zutat> getCondiments() {
		return condiments;
	}

	/* iterates over the condiment list, gets the respective prices and adds that 
	to a total cost which then is returned */
	public double cost() {
		double cost = this.price;
		for(Zutat condiment : condiments){
			cost += condiment.getPreis();
		}
		return cost;
	}

	public String exportDescription() {
		String description = this.description;
		for(Zutat condiment : condiments){
			description += condiment.getBeschreibung();
		}
		return description;
	}

	public String getBeschreibung() {
		return this.description;
	}


	public double getPreis() {
		return this.price;
	}

}


// :)
========
package Entwurfsmuster.Decorator.Beispiele.KaffeeStrategie;

import java.util.ArrayList;
import java.util.List;

public abstract class Beverage {
	
	protected String description;
	protected double price;
	private final List<Zutat> condiments = new ArrayList<>();

	public Beverage(String description, double price) {
		this.description = description;
		this.price = price;
	}

	public void addCondiment(Zutat condiment) {
		condiments.add(condiment);
	}

	public List<Zutat> getCondiments() {
		return condiments;
	}

	/* iterates over the condiment list, gets the respective prices and adds that 
	to a total cost which then is returned */
	public double cost() {
		double cost = this.price;
		for(Zutat condiment : condiments){
			cost += condiment.getPreis();
		}
		return cost;
	}

	public String exportDescription() {
		StringBuilder description = new StringBuilder(this.description);
		for(Zutat condiment : condiments){
			description.append(condiment.getBeschreibung());
		}
		return description.toString();
	}

	public String getBeschreibung() {
		return this.description;
	}


	public double getPreis() {
		return this.price;
	}

}


// :)
>>>>>>>> 1ec590e0e99b902a666672f929c601c5d3d0f1d1:src/Entwurfsmuster/Decorator/Beispiele/KaffeeStrategie/Beverage.java
