package test;

import collections.MyQueue;

public class TestMyQueue {
    public TestMyQueue(){
        {
            System.out.println("\n\nMyQueue");
        }
        MyQueue<String> queue = new MyQueue<>();
        queue.add("Hello");
        queue.add("world");
        queue.add("java");

        System.out.println("Розмір: " + queue.size());
        System.out.println("Перший елемент: " + queue.peek());
        System.out.println("Перший елемент (poll): " + queue.poll());
        System.out.println("Розмір після poll: " + queue.size());
        System.out.println("Новий перший елемент після poll: " + queue.peek());

        queue.clear();
        System.out.println("Розмір після очищення: " + queue.size());
    }
}
