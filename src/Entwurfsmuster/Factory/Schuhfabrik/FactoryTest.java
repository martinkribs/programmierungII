package Entwurfsmuster.Factory.Schuhfabrik;

import java.util.ArrayList;
import java.util.List;

import Entwurfsmuster.Factory.Schuhfabrik.KonkreteSchuhFabriken.AdidasFabrik;
import Entwurfsmuster.Factory.Schuhfabrik.KonkreteSchuhFabriken.PumaFabrik;
import Entwurfsmuster.Factory.Schuhfabrik.interfaces.ISchuh;
import Entwurfsmuster.Factory.Schuhfabrik.interfaces.ISchuhFabrik;
// import ProgrammierungII.designPatterns.factory.SchuhFabrik_live.ISchuh;

public class FactoryTest {
    public static void main(String[] args) {
        List<ISchuhFabrik> schuhFabriken = new ArrayList<>();
        List<ISchuh> schuhe = new ArrayList<>();
                        
        ISchuhFabrik pumaFabrik = new PumaFabrik(); 
        ISchuhFabrik adidasFabrik = new AdidasFabrik(); 

        schuhFabriken.add(pumaFabrik);
        schuhFabriken.add(adidasFabrik);
        
        schuhe.add(adidasFabrik.createSchuh("W")); // W, W, W, W, W, W, EEEEEEEEEEEE
        schuhe.add(adidasFabrik.createSchuh("Wander"));
        schuhe.add(pumaFabrik.createSchuh("Turn"));
        schuhe.add(adidasFabrik.createSchuh("Wanderschuh"));

        schuhe.forEach(schuh -> System.out.println(schuh.print()));
        
    }
}