package Generics.Container;

import java.util.ArrayList;

public class Stack<T> extends ArrayList<T> {

    /**
     * ArrayList
     */
    ArrayList<T> stack;

    /**
     * Stack
     */
    public Stack() {
        this.stack = new ArrayList<>();
    }

    /**
     * liefert true, wenn der Stack leer ist, ansonsten false.
     *
     * @return bool
     */
    public boolean empty() {
        return this.stack == null;
    }

    /**
     * legt item oben auf den Stack und gibt item zurück.
     *
     * @param item
     * @return T
     */
    public T push(T item) {
        this.stack.add(item);
        return item;
    }

    /**
     * löscht das oberste Element des Stacks und liefert es zurück.
     *
     * @return T
     */
    public T pop() {
        T item = this.peek();
        this.stack.remove(item);
        return item;
    }

    /**
     * liefert das oberste Element des Stacks.
     *
     * @return T
     */
    public T peek() {
        return this.stack.get(this.stack.size() - 1);
    }
}
