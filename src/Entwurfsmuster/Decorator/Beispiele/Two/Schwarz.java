package Entwurfsmuster.Decorator.Beispiele.Two;

public class Schwarz extends Beverage
{
    private String description = "Dunkel dunkel dunkel. Nom nom nom.";
    
    public Schwarz()
    {
        description = "Schwarz";
        price = 0.69;
    }

    @Override
    public double cost() {
        return price;
    }
}