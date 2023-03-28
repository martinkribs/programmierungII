package Generics.Uebungen;

public class Paar<T, U> implements Markierbar<String> {
    protected T value1;
    protected U value2;

    public Paar(T value1, U value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValue1() {
        return value1;
    }

    public U getValue2() {
        return value2;
    }

    @Override
    public void setMarke(String m) {

    }

    @Override
    public String getMarke() {
        return null;
    }
}
