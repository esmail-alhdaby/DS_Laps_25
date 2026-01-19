package Queue;

public interface Queue <E>{
    public boolean isEmpty();
    public int size();
    public void enqueue(E e);
    public E dequeu();
    public E first();
}
