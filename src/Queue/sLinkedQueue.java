package Queue;

import SinglyLinkedList.SinglyLinkedList;

public class sLinkedQueue<E> implements Queue<E>{

    SinglyLinkedList<E> slist = new SinglyLinkedList<E>();

    @Override
    public boolean isEmpty() {
        return slist.isEmpty();
    }

    @Override
    public int size() {
        return slist.size();
    }

    @Override
    public void enqueue(E data) {
         slist.addLast(data);
    }

    @Override
    public E dequeu() {
        return slist.removeFirst();
    }

    @Override
    public E first() {
        return slist.getFirst();
    }
    public void display(){
        slist.display();
    }
}
