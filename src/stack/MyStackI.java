package stack;

public interface MyStackI<E> {
    void push(E element);

    boolean remove(E element);

    void clear();

    int size();

    E peek();

    E pop();
}