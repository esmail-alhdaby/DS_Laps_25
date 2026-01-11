package Stack;

public interface Stack <E>{
    public boolean isEmpty();
    public int size();
    public void push(E e);
    public E pop();
    public E peek();
}
