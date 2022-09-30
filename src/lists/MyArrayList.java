package lists;

import java.util.Arrays;
import java.util.Collection;

public class MyArrayList<E> implements MyList<E> {
    private final static int INITIAL_CAPACITY = 10;

    private Object[] array;
    private int size;

    public MyArrayList() {
        array = new Object[INITIAL_CAPACITY];
    }

    public MyArrayList(Collection<E> collection) {
        array = new Object[collection.size()];
        for (E element : collection) {
            add(element);
        }

    }

    @Override
    public void add(E element) {
        if (size == array.length - 1) {
            expandArray();
        }
        array[size++] = element;
    }

    private void expandArray() {
        int oldCapacity = array.length;
        int newCapacity = oldCapacity + (oldCapacity / 2);

        if (newCapacity <= INITIAL_CAPACITY) {
            newCapacity = INITIAL_CAPACITY;
        }

        array = Arrays.copyOf(array, newCapacity);
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index > array.length) {
            throw new IndexOutOfBoundsException("Search index: " + index + " ArrayList size: " + size);
        }

        System.arraycopy(array, index + 1, array, index, size - index);
        size--;

        shrinkArray();
    }

    private void shrinkArray() {
        int freePlaceInArray = array.length - size;
        int newArrayCapacity = array.length * 2 / 3 + 1;

        if (freePlaceInArray > size * 3 / 2 && newArrayCapacity >= INITIAL_CAPACITY) {

            Object[] newArray = new Object[newArrayCapacity];
            System.arraycopy(array, 0, newArray, 0, size());
            array = newArray;
        }
    }

    @Override
    public void clear() {
        array = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Search index: " + index + " ArrayList size: " + size);
        }
        return (E) array[index];
    }

    @Override
    public String toString() {
        return " MyArrayList :" + Arrays.toString(Arrays.copyOf(array, size())) + " ; size = " + size() + " ";
    }

}
