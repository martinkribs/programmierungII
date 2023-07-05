package Exception_Handling.Uebungen.Personenalter;

public class Personenalter {

    Personenalter(int alter) throws OutOfRangeException {
        if (alter<0 || alter>150){
            throw new OutOfRangeException(alter);
        }
        System.out.println(alter);
    }
}
