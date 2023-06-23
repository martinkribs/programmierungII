package Entwurfsmuster.Decorator.Uebungen.Kaffeehaus2;

public class Whip extends CondimentDecorator
{
    public Whip(Beverage beverage)
    {
        super(beverage);
        this.description = "whippety whip, slurp slurp";
        this.price = 0;
    }
}