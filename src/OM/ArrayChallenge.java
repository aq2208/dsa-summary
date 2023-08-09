package src.OM;


import java.util.LinkedList;
import java.util.Queue;

class Node {
    String value;
    Node left;
    Node right;

    public Node(String value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class ArrayChallenge {
    public static Node arrayToBinaryTree(String[] arr) {
        if (arr.length == 0) {
            return null;
        }

        Node root = new Node(arr[0]);
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (!queue.isEmpty() && i < arr.length) {
            Node current = queue.poll();

            if(current.value.equals("#")) {
                continue;
            }

            current.left = new Node(arr[i]);
            queue.offer(current.left);
            i++;

            if (i < arr.length) {
                current.right = new Node(arr[i]);
                queue.offer(current.right);
                i++;
            }
        }
        return root;
    }

    public static void preOrder(Node root) {  //root can be root of the entire tree or root of the subtree
        if(root == null) {
            return;
        }
        if(!(root.value.equals("#")))
            System.out.println(root.value + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        String[] arr = {"5", "2", "6", "1", "9", "#", "8", "#", "#", "#", "#", "4", "#"};
//        String[] arr = {"4", "1", "5", "2", "#", "#", "#"};
        preOrder(arrayToBinaryTree(arr));
    }
}
