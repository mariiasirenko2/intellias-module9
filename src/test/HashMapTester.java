package test;

import hashmap.MyHashMap;
import hashmap.MyMap;


public class HashMapTester implements Tester {

    @Override
    public void test() {
        MyMap<Integer, String> map = new MyHashMap<>();

        System.out.println("[TEST] HashMap:");
        System.out.println("1. Test add method: Fill HashMap");
        map.put(1, "A");
        map.put(212, "B");
        map.put(34, "C");
        map.put(46, "D");
        map.put(76, "E");
        map.put(61, "F");
        map.put(1, "??");
        map.put(21, "L");
        map.put(22, "M");
        map.put(23, "R");
        map.put(24, "R");
        map.put(25, "S");
        map.put(26, "W");
        map.put(27, "Q");
        map.put(28, "T");
        map.put(29, "X");


        System.out.println(map);
        System.out.println("2. Test get method: try to get value with key=1");
        System.out.println("   Key 1, value = " + map.get(1));

        System.out.println("3 Test remove method: Remove element with key=1: ");
        System.out.println("HashMap before remove: \n" + map);
        map.remove(1);
        System.out.println("HashMap after remove: \n" + map);


        System.out.println("4. Test clear method");
        map.clear();
        System.out.println("Map after clear method \n" + map);


    }
}

