package src.datastructures.heap;

import java.util.PriorityQueue;

public class HeapBuiltin {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        heap.offer(1);  // Insert value to the priority queue
        heap.poll();  // Retrieve and remove the head of the priority queue
        heap.peek();  // Retrieve but not remove the head of the priority queue
    }
}