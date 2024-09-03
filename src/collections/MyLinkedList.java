package collections;

public class MyLinkedList<T> {
    private int size;
    private Node<T> head;
    private Node<T> tail;
    private static class Node<T>{
        private Node<T> prev;
        private Node<T> next;
        private T value;
        Node(T value, Node<T> prev, Node<T> next){
            this.value = value;
            this.next=next;
            this.prev=prev;
        }
    }

    public void add(T value){
        Node<T> newNode= new Node<T>(value, tail, null);
        if(tail==null){
            head=newNode;
        }
        else{
            tail.next=newNode;
        }

        tail=newNode;
        size++;
    }

    public void remove(int index){
        if (index<0||index>size){
            throw new IndexOutOfBoundsException("INCORRECT INDEX!");
        }

        Node<T> currentNode=getNode(index);
        if(currentNode.prev==null)head=currentNode.next;
        else currentNode.prev.next = currentNode.next;

        if(currentNode.next==null) tail=currentNode.prev;
        else currentNode.next.prev= currentNode.prev;


    }

    public Node<T> getNode(int index){

        Node<T> currentNode=head;
        for(int i=0;i<index;i++){
            currentNode=currentNode.next;
        }
        return currentNode;
    }

    public T get(int index){
        if (index<0||index>size){
            throw new IndexOutOfBoundsException("INCORRECT INDEX!");
        }
        return getNode(index).value;
    }

    public int size(){
        return size;
    }

    public void clear(){
        //не знаю чи звільняється пам ять
        head = null;
        tail = null;
        size = 0;
    }




}
