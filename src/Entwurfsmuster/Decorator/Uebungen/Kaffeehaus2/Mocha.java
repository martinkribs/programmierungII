package Entwurfsmuster.Decorator.Uebungen.Kaffeehaus2;

public class Mocha extends CondimentDecorator
{
    public Mocha(Beverage beverage)
    {
        super(beverage);
        this.description = "chocetty choc";
        this.price = 0.35;
    }
}