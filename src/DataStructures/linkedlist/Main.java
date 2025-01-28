package src.datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedListDemo linkedListDemo = new LinkedListDemo();
        linkedListDemo.addFirst(1);
        linkedListDemo.addFirst(2);
        linkedListDemo.addFirst(3);
        linkedListDemo.addFirst(4);
        linkedListDemo.addFirst(5);
        linkedListDemo.display();

        linkedListDemo.removeFirst();
        linkedListDemo.display();

        linkedListDemo.addAfterIndex(10, 2);
        linkedListDemo.display();

        System.out.println(linkedListDemo.searchByValue(20));

        linkedListDemo.bubbleSort();
        linkedListDemo.display();

        System.out.println("Reverse list: ");
        linkedListDemo.reverse();
        linkedListDemo.display();

    }

}
