package test;

import collections.MyStack;

public class TestMyStack {
    public TestMyStack(){
        {
            System.out.println("\n\nMyStack");
        }
        MyStack<String> stack = new MyStack<>();
        stack.push("Hello");
        stack.push("world");
        stack.push("java");

        System.out.println("Розмір: " + stack.size());
        System.out.println("Верхівка стеку: " + stack.peek());
        System.out.println("Верхівка стеку (pop): " + stack.pop());
        System.out.println("Розмір після видалення: " + stack.size());

        stack.remove(0);
        System.out.println("Верхівка після видалення елемента з індексом 0: " + stack.peek());

        stack.clear();
        System.out.println("Розмір після очищення: " + stack.size());
    }
}
