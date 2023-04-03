package Generics.Container;

public class Klasse implements Comparable<Klasse> {
    private int id;

    public Klasse(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Klasse o) {
        return Integer.compare(this.getId(), o.getId());
    }
}
