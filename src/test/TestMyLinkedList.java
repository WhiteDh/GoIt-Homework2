package test;

import collections.MyArrayList;

public class TestMyLinkedList {
    public TestMyLinkedList(){
        {
            System.out.println("\n\nMyLinkedList");
        }
        MyArrayList<String> list2 = new MyArrayList<>();
        list2.add("Hello");
        list2.add("world");
        list2.add("java");
        list2.add("the");
        list2.add("best");

        System.out.println(list2.size());
        System.out.println(list2.get(2));

        //Exception
        try {
            System.out.println(list2.get(-5));
            System.out.println(list2.get(15));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        list2.remove(2);
        System.out.println(list2.get(2));
        list2.clear();
        System.out.println(list2.get(0));
    }
}
