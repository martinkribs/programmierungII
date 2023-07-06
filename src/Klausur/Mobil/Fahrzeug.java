package Klausur.Mobil;

public abstract class Fahrzeug implements Abbiegen, Beschleunigen, Bremsen {
    protected Bremsen bremsType;

    protected Beschleunigen beschleunigungsType;

    protected Abbiegen abbiegeType;

    public void bremsen() {
        this.bremsType.bremsen();
    }

    public void beschleunigen() {
        this.beschleunigungsType.beschleunigen();
    }

    public void abbiegen() {
        this.abbiegeType.abbiegen();
    }

    public void setAbbiegeType(Abbiegen abbiegeType) {
        this.abbiegeType = abbiegeType;
    }

    public void setBeschleunigungsType(Beschleunigen beschleunigungsType) {
        this.beschleunigungsType = beschleunigungsType;
    }

    public void setBremsType(Bremsen bremsType) {
        this.bremsType = bremsType;
    }
}
