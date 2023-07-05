package Exception_Handling.Uebungen;

public class OutOfRangeException extends Exception
{
    OutOfRangeException(int alter){
        System.out.println("Das Alter war " + alter);
        System.out.println("Gültiges Alter liegt zwischen 0 und 150");
    }
}
