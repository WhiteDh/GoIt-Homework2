package collections;

public class MyQueue<T> {
    private int size;
    private Node<T> head;
    private Node<T> tail;
    private static class Node<T>{

        private Node<T> next;
        private T value;
        Node(T value){
            this.value = value;
            this.next=null;

        }
    }

    public void add(T value){
        Node<T> newNode= new Node<T>(value);
        if(tail==null){
            head=newNode;
        }
        else{
            tail.next=newNode;
        }

        tail=newNode;
        size++;
    }

    public int size(){
        return size;
    }

    public void clear(){
        //???
        head = null;
        tail = null;
        size = 0;
    }

    public T peek(){
        if (head==null) return null;
        return head.value;
    }

    public T poll(){
        if (head==null) return null;
        size--;
        T valueToReturn=head.value;
        head=head.next;
        return valueToReturn;
    }
}
