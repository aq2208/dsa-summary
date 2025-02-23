package src.datastructures.heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    List<Integer> heap;

    public Heap() {
        heap = new ArrayList<Integer>();
        heap.add(0);
    }

    public void push(int val) {
        heap.add(val);
        int i = (heap.size() - 1);

        while (i > 1 && heap.get(i/2) > val) {
            int tmp = heap.get(i/2);
            heap.set(i/2, val);
            heap.set(i, tmp);

            i = i / 2;
        }
    }

    public int pop() {
        if (heap.size() == 1) {
            //return null;
        }
        if (heap.size() == 2) {
            return heap.remove(heap.size() - 1); // equivalent to heap.remove(1)
        }
            
        // Get the first element (the root) to return
        int res = heap.get(1);
        
        // Move last value to root
        heap.set(1, heap.remove(heap.size() - 1));
        int i = 1;
        
        // Percolate down
        while(2 * i < heap.size()) {  // while the root has the left child
            if (2 * i + 1 < heap.size() &&  // if the root also has the right child
            heap.get(2 * i + 1) < heap.get(2 * i) &&  // and the right child is smaller than the left child
            heap.get(i) > heap.get(2 * i + 1)) {  // and the root is greater than the right child
                // Swap right child
                int tmp = heap.get(i);
                heap.set(i, heap.get(2 * i + 1));
                heap.set(2 * i + 1, tmp);
                i = 2 * i + 1;
            } else if (heap.get(i) > heap.get(2 * i)) {
                // Swap left child
                int tmp = heap.get(i);
                heap.set(i, heap.get(2 * i));
                heap.set(2 * i, tmp);
                i = 2 * i;
            } else {
                break;
            }
        }
        
        return res;
    }
}
