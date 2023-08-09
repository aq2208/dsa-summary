package src.DataStructures.LinkedLists;

public class LinkedListDemo {

    private Node head;  //The head node of the linked list
    private Node tail; //The tail node of the linked list

    //Constructor
    public LinkedListDemo() {
        this.head = null;
        this.tail = null;
    }

    //Check if the linked list is empty
    public boolean isEmpty() {
        return (head == null);
    }

    //Clear all the linked list
    public void clear() {
        head = null;
    }

    //Get size
    public int getSize() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    //Linked list traversal
    public void display() {
        Node current = head;
        while (current != null) {
            if(current.next != null) {
                System.out.print(current.data + " -> ");
            } else {
                System.out.println(current.data);
            }
            current = current.next;
        }
    }

    //Add a new node at the head
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            head = tail = newNode;
            newNode.next = null;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    //Add a new node at the tail
    public void addLast(int data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
            newNode.next = null;
        }
    }

    //Add a new node at a specific position
    public void addAfterIndex(int data, int index) {
        Node newNode = new Node(data);

        //If the Linked List is empty
        if (isEmpty()) {
            head = tail = newNode;
        }

        //If the position (index) is 0 or less than 0
        else if (index <= 0) {
            addFirst(newNode.data);
        }

        //For any other position
        else {
            //Perform adding
            Node current = head;
            int currentPosition = 0;

            //Get to the node at index
            while (current != null && currentPosition < index) {
                current = current.next;
                currentPosition++;
            }
            //now current is at index node

            if (current != null) {
                newNode.next = current.next;
                current.next = newNode;
            } else {
                //Position is beyond the end of the list
                System.out.println("Invalid position. Node will be appended at the end");
                addLast(newNode.data);
            }
        }

    }

    //Remove the first node from the linked list
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Empty list");
            return;
        }
        if (head.next == null) {
            head = null;
        }

        Node current = head;
        head = current.next;
    }

    //Remove the last node from the linked list
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Empty list");
            return;
        }
        if (head.next == null) {
            head = null;
        }

        Node current = head;
        while (current.next.next != null) {  //get to the node right before tail node
            current = current.next;
        }
        current.next = null;
        tail = current;
    }

    public void removeAtIndex(int index) {
        if (isEmpty()) {
            System.out.println("Empty list");
            return;
        } else if (index <= 0) {
            System.out.println("Invalid position");
            return;
        } else {
            Node current = head;
            int currentPosition = 0;

            while (current != null && currentPosition < index) {
                current = current.next;
                currentPosition++;
            }

            if (current != null && current.next != null) {
                current.next = current.next.next;
            } else {
                System.out.println("Invalid position");
                return;
            }
        }
    }

    public void bubbleSort() {
        Node current, currentNext;
        int temp;

        for (current = head; current != null; current = current.next) {
            for (currentNext = current.next; currentNext != null; currentNext = currentNext.next) {
                if (currentNext.data < current.data) {
                    temp = current.data;
                    current.data = currentNext.data;
                    currentNext.data = temp;
                }
            }
        }
    }

    public void mergeSort() {

    }

    public int searchByValue(int data) {
        Node current = head;
        int currentPosition = 0;

        while (current != null) {
            if (current.data == data) {
                return currentPosition;
            }
            current = current.next;
            currentPosition++;
        }

        return -1;
    }

    public void reverse() {
        Node current = head;  //represent the current considering node, start from the head of the list
        Node next = null;  //represent the next node in the list
        Node prev = null;  //represent the previous node in the list

        //reverse the linked list
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        //Re-set the head and tail
        tail = head;
        head = prev;
    }

}
