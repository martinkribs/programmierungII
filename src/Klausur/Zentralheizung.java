package Klausur;

public enum Zentralheizung {

    UNIQUE_INSTANCE;

    private double fuellstand = 0.0;

    public void heizen() {
        if (fuellstand>0.0) {
            System.out.println("heizen");
        }
    }

}
