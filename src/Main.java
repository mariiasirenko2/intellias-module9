import test.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Tester> listOfTesters = new ArrayList<>(
                List.of(new ArrayListTester(),
                        new LinkedListTester(),
                        new QueueTester(),
                        new StackTester(),
                        new HashMapTester())
        );


        for (Tester tester : listOfTesters) {
            tester.test();
        }

    }
}


