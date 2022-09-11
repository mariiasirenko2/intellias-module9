package queue;

public interface MyQueueI<E> {
    void add(E value);

    boolean remove(E element);

    void clear();

    int size();

    E peek();

    E poll();

}
