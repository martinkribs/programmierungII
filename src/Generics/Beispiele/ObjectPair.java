package Generics.Beispiele;

// Bsp. aus "Der Weg zum Java-Profi (Michael Inden)"

public class ObjectPair {
    private Object first;
    private Object second;

    public ObjectPair(Object first, Object second) {
        this.first = first;
        this.second = second;
    }
    public Object getFirst() {
        return first;
    }
    public Object getSecond() {
        return second;
    }

    
}
