package Entwurfsmuster.Decorator.Uebungen.Kaffeehaus1;

import java.util.ArrayList;
import java.util.List;

public abstract class Beverage {

	protected String description;

	protected double price;

	private boolean milk;

	private boolean soy;

	private boolean mocha;

	private double milkCost = 1.5;

	private double soyCost = 1.5;

	private double mochaCost = 1.5;

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

	/*
	 * iterates over the condiment list, gets the respective prices and adds that
	 * to a total cost which then is returned
	 */
	public double cost() {
		double condimentCost = 0.0;
		if (hasMilk()) {
			condimentCost += milkCost;
		}
		if (hasSoy()) {
			condimentCost += soyCost;
		}
		if (hasMocha()) {
			condimentCost += mochaCost;
		}
		return condimentCost;
	}

	private boolean hasMilk() {
		return this.milk;
	}


	private boolean hasSoy() {
		return this.soy;
	}


	private boolean hasMocha() {
		return this.mocha;
	}

	public String exportDescription() {
		String description = this.description;
		for (Zutat condiment : condiments) {
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
