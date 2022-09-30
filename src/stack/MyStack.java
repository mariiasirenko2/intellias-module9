package stack;

import node.Node;

public class MyStack<E> implements MyCustomStack<E> {
    private Node<E> head;
    private int size;

    public MyStack() {
    }

    @Override
    public void push(E value) {
        head = new Node<>(head, value);
        size++;
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
        head = null;
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
    public E pop() {
        if (head == null) {
            return null;
        }

        Node<E> nodeToDelete = head;
        head = head.getNext();
        --size;

        return nodeToDelete.getItem();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(" MyStack: [");

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
