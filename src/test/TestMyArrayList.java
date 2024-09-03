package test;

import collections.MyArrayList;

public class TestMyArrayList {
    public TestMyArrayList(){
        {
            System.out.println("\n\nMyArrayList");
        }
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Hello");
        list.add("world");
        list.add("java");
        list.add("the");
        list.add("best");

        System.out.println(list.size());
        System.out.println(list.get(2));

        //Exception
        try {
            System.out.println(list.get(-5));
            System.out.println(list.get(15));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        list.remove(2);
        System.out.println(list.get(2));
        list.clear();
        System.out.println(list.get(0));
    }
}
