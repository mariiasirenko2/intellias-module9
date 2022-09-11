package test;

import lists.MyLinkedList;
import lists.MyList;

import java.util.List;

public class LinkedListTester implements Tester {
    @Override
    public void test() {
        MyList<Integer> list;

        System.out.println("[TEST] LinkedList:");
        System.out.println("1. Test constructor: Fill with 1-6 values using List");
        list = new MyLinkedList<>(List.of(1, 2, 3, 4, 5, 6));
        System.out.println("   Filled MyLinkedList = " + list);
        System.out.println("2. Test clear method");
        list.clear();
        System.out.println("   Clear MyLinkedList = " + list);
        System.out.println("3. Test add method: Add 1-6 values with for loop");
        for (int i = 1; i < 7; ++i) {
            list.add(i);
            System.out.println("   Add: " + i + list);
        }
        System.out.println("4. Test get method: Get element on 5th index ");
        System.out.println("   MyALinkedList element on 5th  index (expected) = 6, actual = " + list.get(5));

        System.out.println("5.1 Test remove method: Remove element on 5th index");
        list.remove(5);
        System.out.println("   MyLinkedList after remove element on 5th index: " + list);

        System.out.println("5.2 Test remove method: Remove 10th element (out of MyLinkedList current size)");
        try {
            list.remove(10);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("   Caught IndexOutOfBoundsException: trying to access to 10th element, actual size = " + list.size());
            System.out.println("   MyALinkedList after attempt to remove 10th element: " + list);
        }


    }
}
