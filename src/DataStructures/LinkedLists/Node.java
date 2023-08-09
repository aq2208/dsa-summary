package src.DataStructures.LinkedLists;

public class Node {
    int data;
    Node next;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node(int data, Node p) {
        this.data = data;
        this.next = p;
    }
}
