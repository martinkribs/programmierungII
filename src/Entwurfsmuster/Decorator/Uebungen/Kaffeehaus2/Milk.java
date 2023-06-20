package Entwurfsmuster.Decorator.Uebungen.Kaffeehaus2;

public class Milk extends CondimentDecorator
{
    public Milk(Beverage beverage)
    {
        super(beverage);
        this.description = "Milch von der Kuh moohoo";
        this.price = 0.10;

    }
}