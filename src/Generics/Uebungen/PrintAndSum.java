package Generics.Uebungen;

/**
 * Print and Sum
 */
public class PrintAndSum {

    /**
     * main method
     * @param args String array
     */
    public static void main(String[] args) {
        //set
        Paar<String, String> geWa = new Paar<>("Getrud", "Walter");
        //print
        print(geWa);
        //set
        Paar<Integer, Integer> test = new Paar<>(1, 2);
        //sum
        System.out.println(sum(test));
    }

    /**
     * print values of Paar
     * @param p Paar
     */
    public static void print(Paar<?, ?> p) {
        Object v1 = p.getValue1();
        Object v2 = p.getValue2();
        System.out.println("(" + v1 + ", " + v2 + ")");
    }

    /**
     * sum method
     * @param p Paar
     * @return sum of values in Paar
     */
    public static double sum(Paar<? extends Number, ? extends Number> p) {
        double v1 = p.getValue1().doubleValue();
        double v2 = p.getValue2().doubleValue();
        return v1 + v2;
    }
}
