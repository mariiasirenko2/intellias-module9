package test;

import stack.MyStack;
import stack.MyCustomStack;

public class StackTester implements Tester {
    @Override
    public void test() {
        MyCustomStack<Integer> stack;
        System.out.println("[TEST] Stack:");

        System.out.println("1. Test push method: Add 1-6 values with for loop");
        stack = new MyStack<>();
        for (int i = 1; i < 7; ++i) {
            stack.push(i);
            System.out.println("   Push: " + i + stack);
        }
        System.out.println("2. Test peek method");
        System.out.println("   MyStack peek = " + stack.peek());

        System.out.println("3.1 Test remove method: Remove 5: " + stack.remove(5));
        System.out.println("   MyStack after remove 5t: " + stack);

        System.out.println("3.2 Test remove method: Remove 10: " + stack.remove(10));
        System.out.println("   MyStack after attempt to remove 10th element: " + stack);


        System.out.println("4. Test pop method");
        System.out.println("   MyStack before pop = " + stack);
        stack.pop();
        System.out.println("   MyStack after pop = " + stack);

        System.out.println("5. Test clear method");
        stack.clear();
        System.out.println("   MyStack after clear = " + stack);


    }
}