package Generics.Container;

import java.util.ArrayList;

public class Stack<T> extends ArrayList<T> {

    /**
     * liefert true, wenn der Stack leer ist, ansonsten false.
     *
     * @return bool
     */
    public boolean empty() {
        return this.size() == 0;
    }

    /**
     * legt item oben auf den Stack und gibt item zurück.
     *
     * @param item item
     * @return T
     */
    public T push(T item) {
        this.add(item);
        return item;
    }

    /**
     * löscht das oberste Element des Stacks und liefert es zurück.
     *
     * @return T
     */
    public T pop() {
        T item = this.peek();
        this.remove(item);
        return item;
    }

    /**
     * liefert das oberste Element des Stacks.
     *
     * @return T
     */
    public T peek() {
        int index = this.size();
        return this.get(index - 1);
    }
}
