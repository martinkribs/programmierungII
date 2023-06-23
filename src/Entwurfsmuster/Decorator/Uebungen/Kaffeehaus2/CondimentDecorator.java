package Entwurfsmuster.Decorator.Uebungen.Kaffeehaus2;

public abstract class CondimentDecorator extends Beverage
{   
    protected Beverage beverage;
    protected CondimentDecorator(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public double cost()
    {
        return this.beverage.cost() + this.price;
    }

    @Override
    public String getDescription()
    {
        return this.beverage.getDescription() + ", " + this.description;
    }
} 