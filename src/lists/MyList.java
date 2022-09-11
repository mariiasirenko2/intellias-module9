package lists;

public interface MyList<E> {
    void add(E element);

    void remove(int index);

    void clear();

    int size();

    E get(int index);
}
