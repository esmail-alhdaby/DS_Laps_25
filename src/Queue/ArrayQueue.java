package Queue;

public class ArrayQueue<E> implements Queue<E>  {
    private E arr[];
    private int f=0;
    private static final int CAPICITY=1000;
    private int size=0;


    public ArrayQueue(){
        this(CAPICITY);
    }
    public ArrayQueue(int CAPICITY) {
        arr = (E[]) new Object[CAPICITY];
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void enqueue(E data) {
       if (size()==arr.length){
           System.out.println("can not more....the queue is full..");}
       else {
           int av=(f+size)% arr.length;
           arr[av]=data;
           size++;
       }
    }

    @Override
    public E dequeu() {
        if (isEmpty()) return null;
        E delete=arr[f];
        arr[f]=null;
        f=f+1;
        size--;
        return delete;
    }

    @Override
    public E first() {
        return arr[f];
    }
    public void display() {
        for (int i = 0; i < size; i++) {
            int index = (f + i) % arr.length;
            System.out.print(arr[index] + " ");
        }
    }}