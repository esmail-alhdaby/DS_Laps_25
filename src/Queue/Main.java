package Queue;

import SinglyLinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args){
        SinglyLinkedList<Integer> slist = new SinglyLinkedList<Integer>();

        slist.addLast(10);
        slist.addLast(20);
        slist.addLast(30);
        slist.addLast(40);
        System.out.println(slist.getFirst());

  //      while (!slist.isEmpty()){
    //    System.out.println("element removed: "+slist.dequeu);
    }
}
