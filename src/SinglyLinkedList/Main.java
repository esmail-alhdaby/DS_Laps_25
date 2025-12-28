
package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list=new SinglyLinkedList<Integer>();
        list.addFirst(10);
        list.addFirst(60);
        list.addFirst(30);
        list.removeFirst();
        list.display();


    }
}
