package Klausur.Mobil;

public class Person {

    String name;
    Fahrzeug fahrzeug;

    Person(String name){
        this.name = name;
    }

    public void setFahrzeug(Fahrzeug fahrzeug){
        this.fahrzeug = fahrzeug;
    }

    public void fahren(){
        this.fahrzeug.beschleunigen();
    }

    public void bremsen(){
        this.fahrzeug.bremsen();
    }

    public void abbiegen(){
        this.fahrzeug.abbiegen();
    }
}
