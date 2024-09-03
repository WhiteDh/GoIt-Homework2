package collections;

public class MyStack<T> {
    private int size;
    private Node<T> last;

    private static class Node<T>{

        private Node<T> next;
        private T value;
        Node(T value, Node<T> next){
            this.value = value;
            this.next=next;

        }
    }

    public void push(T value){

        last=new Node<T>(value, last);
    }

    public int size(){
        return size;
    }

    public void clear(){
        //не знаю чи звільняється пам ять
        last = null;
        size = 0;
    }

    public T peek(){
        if (last==null) return null;
        return last.value;
    }

    public T pop(){
        if (last==null) return null;
        size--;
        T valueToReturn=last.value;
        last=last.next;
        return valueToReturn;
    }


    public void remove(int index){
        if(last==null) return;
        if(index==0) pop();
        Node<T> currentNode = last;
        Node<T> prevNode=null;
        for(int i=0;i<index;i++){
            prevNode=currentNode;
            currentNode=currentNode.next;
        }
        if (prevNode != null) {
            prevNode.next = currentNode.next;
        }
        size--;

    }
}
