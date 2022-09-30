package test;

import queue.MyQueue;
import queue.MyCustomQueue;

import java.util.List;

public class QueueTester implements Tester {
    @Override
    public void test() {
        MyCustomQueue<Integer> queue;

        System.out.println("[TEST] Queue:");
        System.out.println("1. Test constructor: Fill with 1-6 values using List");
        queue = new MyQueue<>(List.of(1, 2, 3, 4, 5, 6));
        System.out.println("   Filled MyQueue = " + queue);
        System.out.println("2. Test clear method");
        queue.clear();
        System.out.println("   Clear MyQueue = " + queue);
        System.out.println("3. Test add method: Add 1-6 values with for loop");
        for (int i = 1; i < 7; ++i) {
            queue.add(i);
            System.out.println("   Add: " + i + queue);
        }
        System.out.println("4. Test peek method");
        System.out.println("   MyQueue peek = " + queue.peek());

        System.out.println("5.1 Test remove method: Remove 5: " + queue.remove(5));
        System.out.println("   MyQueue after remove 5: " + queue);

        System.out.println("5.2 Test remove method: Remove 10: " + queue.remove(10));
        System.out.println("   MyQueue after remove 10: " + queue);


        System.out.println("6. Test poll method");
        System.out.println("   MyQueue before poll = " + queue);
        queue.poll();
        System.out.println("   MyQueue after poll = " + queue);


    }
}