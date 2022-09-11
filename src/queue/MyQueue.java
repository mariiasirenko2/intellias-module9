package queue;

import node.Node;

import java.util.Collection;

public class MyQueue<E> implements MyQueueI<E> {
    private Node<E> head;
    private Node<E> end;
    private int size;

    public MyQueue() {
    }

    public MyQueue(Collection<E> collection) {
        for (E value : collection) {
            add(value);
        }
    }

    @Override
    public void add(E value) {
        Node<E> temp = this.end;
        Node<E> newNode = new Node<>(temp, value, null);

        this.end = newNode;

        if (head == null) {
            this.head = newNode;
        } else {
            temp.setNext(newNode);
        }
        this.size++;
    }


    @Override
    public boolean remove(E element) {
        Node<E> currentNode = head;
        Node<E> prev = null;

        while (currentNode != null) {
            if (currentNode.getItem().equals(element)) {
                if (currentNode == head) {
                    head = currentNode.getNext();
                }

                if (currentNode == end) {
                    end = prev;
                }

                if (prev != null) {
                    prev.setNext(currentNode.getNext());
                }

                return true;
            }

            prev = currentNode;
            currentNode = currentNode.getNext();
        }

        return false;

    }

    @Override
    public void clear() {
        head = end = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E peek() {
        return (head == null) ? (null) : (head.getItem());
    }

    @Override
    public E poll() {
        if (head == null && end == null) {
            return null;
        }

        Node<E> nodeToDelete = head;
        head = nodeToDelete.getNext();

        if (head == null) {
            end = null;
        }

        size--;

        return nodeToDelete.getItem();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(" MyQueue: [");

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
