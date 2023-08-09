package src.DataStructures.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    Node root;

    public BinarySearchTree() {
        root = null;
    }

    //Binary Tree Insertion
    public void insert(int data) {
        root = insertNode(root, data);
    }

    public Node insertNode(Node root, int data) {
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
            return root;
        }

        if (data < root.data) {
            root.left = insertNode(root.left, data);  //root.left - the root of the left subtree
        } else if (data > root.data) {
            root.right = insertNode(root.right, data);
        }

        return root;
    }

    //Tree Traversals
    public void preOrder(Node root) {  //root can be root of the entire tree or root of the subtree
        if(root == null) {
            return;
        }

        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root) {
        if(root == null) {
            return;
        }

        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);
    }

    public void postOrder(Node root) {
        if(root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data + " ");
    }

    public void breadthFirstTraversal(Node root) {  //a.k.a Level-Order Traversal
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);  //Enqueue the root Node

        while (!queue.isEmpty()) {
            Node current = queue.poll();  //Dequeue the first Node in the Queue

            System.out.println(current.data + " ");  //Print out the root Node

            //Enqueue the children of the dequeued node, if they exist
            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
        }
    }

    //From the Traversal result => Construct the Tree (Binary Search Tree)
    public Node preOrderConstructTree(int[] preOrder, int start, int end) {
        return null;
    }

    public Node inOrderConstructTree(int[] preOrder, int start, int end) {
        return null;
    }

    public Node postOrderConstructTree(int[] preOrder, int start, int end) {
        return null;
    }

    public Node levelOrderConstructTree(int[] preOrder, int start, int end) {
        return null;
    }

    //Searching for a Node

    //Height of the Tree
    public int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    //Count the number of nodes in BST
    public int count(Node root) {
        if (root == null) {
            return 0;
        }

        int leftCount = count(root.left);
        int rightCount = count(root.right);

        return leftCount + rightCount + 1;
    }

    //Deleting a Node
    public void delete(int value) {
        root = deleteNode(root, value);
    }

    private Node deleteNode(Node root, int value) {
        if (root == null) {
            return null;
        }

        if (value < root.data) {
            root.left = deleteNode(root.left, value);
        } else if (value > root.data) {
            root.right = deleteNode(root.right, value);
        } else {
            // Case 1: No child or only one child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 2: Two children
            Node successor = findSuccessor(root.right);
            root.data = successor.data;
            root.right = deleteNode(root.right, successor.data);
        }

        return root;
    }

    private Node findSuccessor(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    //Balancing the Tree (Rotate Tree)
}
