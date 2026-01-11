package Stack;

import java.lang.reflect.Array;

public class ArrayStack <E> implements Stack<E>{
    private E arr[];
    private int t=-1;
    private static final int CAPICITY=1000;

    public ArrayStack(){
        arr = (E[])new Object[CAPICITY];
    }
    public ArrayStack(int c){
        arr = (E[])new Object[c];
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void push(E e) {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }
}
