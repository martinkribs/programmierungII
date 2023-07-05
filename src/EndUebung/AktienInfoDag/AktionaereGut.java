package EndUebung.AktienInfoDag;

public class AktionaereGut extends Aktionaere {

    public AktionaereGut() {
        information = new InfoMitPreis();
    }

    @Override
    public void display() {
        System.out.println(":)");
    }

}
