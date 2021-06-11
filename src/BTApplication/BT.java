package BTApplication;

/**
 * Flatten a binary tree into linked list
 *
 * Given a binary tree, flatten it into linked list in-place. Usage of auxiliary data structure is not allowed.
 * After flattening, left of each node should point to NULL and right should contain next node in preorder.
 *
 *
 * Input :
 *           1
 *         /   \
 *        2     5
 *       / \     \
 *      3   4     6
 *
 * Output :
 *     1
 *      \
 *       2
 *        \
 *         3
 *          \
 *           4
 *            \
 *             5
 *              \
 *               6
 */

public class BT {
    public BT(int data) {
        this.data = data;
    }
    int data;
    BT left;
    BT right;
}

class Driver {
    public static void printPreOrder(BT head){
        if (head == null){
            return;
        }
        System.out.print(head.data + " ");
        printPreOrder(head.left);
        printPreOrder(head.right);
    }
    public static BT prev = null;
    public static void flatten(BT head){
        if (head == null){
            return;
        }
        flatten(head.right);
        flatten(head.left);
        head.right = prev;
        head.left = null;
        prev = head;
    }

    public static void printLinkedList(BT node){
        while(node != null){
            System.out.print(node.data + " ");
            node = node.right;
        }

    }
    public static void main(String[] args) {

        BT head = new BT(1);
        head.left = new BT(2);
        head.right = new BT(3);
        head.right.left = new BT(4);
        head.right.right = new BT(5);
        head.left.left = new BT(6);
        head.left.right = new BT(7);
        head.right.left.right = new BT(8);
        head.right.right.left = new BT(9);
        head.right.right.right = new BT(10);
        head.right.right.right.left = new BT(11);
        head.left.left.right = new BT(12);

        System.out.println("Pre order traversal : ");
        printPreOrder(head);
        System.out.println();

        System.out.println("After flatten ==> Pre order traversal : ");
        flatten(head);
        printLinkedList(head);
        System.out.println();
    }
}
// This code is contributed by Gaurav Kumar