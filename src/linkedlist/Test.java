package linkedlist;

public class Test{
    public static void main(String[] args) {
        System.out.println("TEST");
        MyLinkedList ll = new MyLinkedList(9    );
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4,9);
        ll.add(4,9);
        ll.printList();
    }
}
