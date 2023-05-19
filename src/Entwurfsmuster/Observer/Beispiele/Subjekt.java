package Entwurfsmuster.Observer.Beispiele;

public interface Subjekt {
    void registriereBeobachter(Beobachter beobachter);
    void entferneBeobachter(Beobachter beobachter);
    void benachrichtigeBeobachter();
}
