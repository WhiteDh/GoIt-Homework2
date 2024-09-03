package collections;

public class MyHashMap<K,V> {
    private Node<K,V>[] table;
    private int size=0;
    private static final int CAPACITY=16;

    private class Node<K,V>{
        K key;
        V value;
        Node<K,V>next;

        Node(K key, V value){
            this.key=key;
            this.value=value;
            this.next=null;
        }


    }

    public MyHashMap() {
        table = new Node[CAPACITY];
    }


    private int hash(K key) {
        return key.hashCode()% table.length;
    }

    public void put(K key, V value){
        int index=hash(key);
        Node<K,V> newNode = new Node<K,V>(key,value);

        if(table[index]==null){
            table[index]=newNode;
        }

        //якщо ключ існує вже, значення оновлюється
        else{
            Node<K,V> currentNode = table[index];
            Node<K,V> prevNode = null;
            while (currentNode!=null){
                if(currentNode.key==key){
                    currentNode.value=value;
                    return;
                }
                prevNode=currentNode;
                currentNode=currentNode.next;
            }
            prevNode.next=newNode;
        }
        size++;
    }

    public void remove(K key){
        int index= hash(key);
        Node<K,V> currentNode=table[index];
        Node<K,V> prevNode=null;
        while (currentNode!=null){
            if(currentNode.key==key){
                if(prevNode==null) {
                    table[index] = currentNode.next;
                } else prevNode.next = currentNode;
                size--;
                return;
            }
            prevNode =currentNode;
            currentNode =currentNode.next;
        }


    }

    public void clear() {
        //не знаю чи звільняється пам ять
        table = new Node[CAPACITY];
        size = 0;
    }


    public int size() {
        return size;
    }

    public V get(K key){
        int index = hash(key);
        Node<K,V> currentNode=table[index];
        while (currentNode!=null){
            if(currentNode.key==key){
                return currentNode.value;
            }
            currentNode= currentNode.next;
        }
        return null;
    }
}
