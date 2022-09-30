package lists;

import node.Node;

import java.util.Collection;
import java.util.Objects;

public class MyLinkedList<E> implements MyList<E> {
    private Node<E> head;
    private Node<E> last;
    private int size;

    public MyLinkedList() {
    }

    public MyLinkedList(Collection<E> collection) {
        for (E value : collection) {
            add(value);
        }
    }

    @Override
    public void add(E element) {
        Node<E> temp = last;
        Node<E> newNode = new Node<>(temp, element, null);

        last = newNode;

        if (head == null) {
            head = newNode;
        } else {
            temp.setNext(newNode);
        }
        size++;
    }

    @Override
    public void remove(int index) {
        Node<E> nodeToDelete = getNode(index);

        if (nodeToDelete == last) {
            nodeToDelete.getPrev().setNext(null);
            last = nodeToDelete.getPrev();
        } else if (nodeToDelete == head) {
            nodeToDelete.getNext().setPrev(null);
            head = nodeToDelete.getNext();
        } else {
            nodeToDelete.getPrev().setNext(nodeToDelete.getNext());
            nodeToDelete.getNext().setPrev(nodeToDelete.getPrev());
        }
        --size;
    }


    private Node<E> getNode(int index) throws IndexOutOfBoundsException {
        try {
            Objects.checkIndex(index, size);
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("Search index: " + index + " LinkedList size: " + size);
        }

        int elementNumber = 0;
        Node<E> currentNode = head;
        while (currentNode != null) {
            if (elementNumber == index) {
                break;
            }
            elementNumber++;
            currentNode = currentNode.getNext();
        }

        return currentNode;
    }


    @Override
    public void clear() {
        head = last = null;
        size = 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public E get(int index) {
        return getNode(index).getItem();
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("MyLinkedList: [");

        for (Node<E> node = head; node != null; node = node.getNext()) {
            stringBuilder.append(node.getItem());

            if (node.getNext() != null) {
                stringBuilder.append(", ");
            }
        }

        stringBuilder.append("], size=").append(size());
        return stringBuilder.toString();
    }
}
