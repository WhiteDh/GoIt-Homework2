package collections;

public class MyArrayList<T>{
    private int size;
    private T[] list;
    private static final int DEFAULT_CAPACITY=5;
    private int capacity;


    public MyArrayList(){
        capacity=DEFAULT_CAPACITY;
        list =  (T[]) new  Object[capacity];
        size=0;
    }

    public int size(){
        return size;
    }

    public void add(T value){
        if(size==capacity){
            expand();
        }
        list[size++] = value;
    }

    private void expand() {
        capacity = list.length * 2;
        T[] newArray = (T[]) new Object[capacity];
        System.arraycopy(list, 0, newArray, 0, size);
        list = newArray;
    }


    public void remove(int index){
        if (index<0||index>size){
            throw new IndexOutOfBoundsException("INCORRECT INDEX!");
        }
        for(int i =index;i<size-1;i++){
            list[i]=list[i + 1];
        }
        list[--size]=null;

    }

    public void clear(){
        list = (T[]) new Object[DEFAULT_CAPACITY];
        capacity=DEFAULT_CAPACITY;
        size = 0;
    }

    public T get(int index){
        if (index<0||index>size){
            throw new IndexOutOfBoundsException("INCORRECT INDEX!");
        }
        return list[index];
    }

}