package test;

import collections.MyHashMap;

public class TestMyHashMap {
    public TestMyHashMap(){
        {
            System.out.println("\n\nMyHashMap");
        }
        MyHashMap<String, String> map = new MyHashMap<>();
        map.put("One", "1");
        map.put("Two", "2");
        map.put("Three", "3");

        System.out.println("Розмір: " + map.size());
        System.out.println("Значення за ключем 'Two': " + map.get("Two"));
        System.out.println("Значення за ключем 'Three': " + map.get("Three"));
        System.out.println("Значення за ключем 'Four': " + map.get("Four"));
        map.remove("Two");
        System.out.println("Розмір після видалення 'Two': " + map.size());

        map.clear();
        System.out.println("Розмір після очищення: " + map.size());
    }
}
