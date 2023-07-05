package Exception_Handling.Uebungen.Konto;

public class KontoNummerAusnahme extends KontoAusnahme{
    
    KontoNummerAusnahme(){
        System.out.println("Sie können keine negative Kontonummer haben");
    }
    
    KontoNummerAusnahme(String message){
        super(message);
    }
}
