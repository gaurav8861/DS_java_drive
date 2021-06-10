package BstApplication;

import java.util.Arrays;
import java.util.List;

/**
 * @GauravKumar
 *
 * Write a function which takes an array and prints the majority element (if it exists), otherwise prints “No Majority Element”.
 * A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element).
 *
 * Examples :
     * Input : {3, 3, 4, 2, 4, 4, 2, 4, 4}
     * Output : 4
     * Explanation: The frequency of 4 is 5 which is greater
     * than the half of the size of the array size.
     *
     * Input : {3, 3, 4, 2, 4, 4, 2, 4}
     * Output : No Majority Element
     * Explanation: There is no element whose frequency is
     * greater than the half of the size of the array size.
 *
 *
 * https://www.geeksforgeeks.org/majority-element/
 */

class CustomBst1{
    public BST head = null;
    class BST {
        int data;
        BST left;
        BST right;
        int count;
    }
    public BST addNode(BST head, int data){
        if (head == null){
            return createNode(data);
        } if (head.data > data) {
            head.left = addNode(head.left, data);
        } else if (head.data < data) {
            head.right = addNode(head.right, data);
        }else{
            head.count = head.count + 1;
        }
        return head;
    }
    public BST createNode(int data){
        BST obj = new BST();
        obj.data = data;
        obj.count = 1;
        return obj;
    }

    public void printInOrderTraversal(BST head, int size){
        if (head == null)
            return;
        printInOrderTraversal(head.left, size);
        if (head.count > (size/2))
            System.out.println(head.data);
        printInOrderTraversal(head.right, size);
    }
}
public class BSTApplication1 {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(10, 5, 15, 9, 9, 9, 9, 9, 19, 19, 9);
        CustomBst1 bst = new CustomBst1();

        for (int i : integers){
            bst.head = bst.addNode(bst.head, i);
        }
//        bst.head = bst.addNode(null, 10);
//        bst.addNode(bst.head, 5);
//        bst.addNode(bst.head, 15);
//        bst.addNode(bst.head, 9);
//        bst.addNode(bst.head, 30);
//        bst.addNode(bst.head, 45);
//        bst.addNode(bst.head, 2);
//        bst.addNode(bst.head, 9);
//        bst.addNode(bst.head, 19);
//        bst.addNode(bst.head, 19);
//        bst.addNode(bst.head, 9);

        bst.printInOrderTraversal(bst.head, integers.size());

    }

}
