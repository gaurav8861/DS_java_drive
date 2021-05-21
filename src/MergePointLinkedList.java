import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MergePointLinkedList {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node) throws IOException {
        while (node != null) {
            System.out.println(node.data);

            node = node.next;
        }
    }

    // Complete the findMergeNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
//    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
//        int len1 = findSize(head1);
//        int len2 = findSize(head2);
//        int d = Math.abs(len1-len2);
//        int value = -12345;
//
//        int index = -1;
//
//        if(len1 >= len2){
//            index = len1-d;
//        }else{
//            index = len2-d;
//        }
//        while(head1 != null && head2 != null){
//            if(head1 == head2){
//                return head1.data;
//            }
//            if(len1>len2 && --index >=0){
//                head1=head1.next;
//                index--;
//            }else if(len1<len2 && --index >=0){
//                head2=head2.next;
//                index--;
//            }else{
//                head1 = head1.next;
//                head2 = head2.next;
//            }
//        }
//        return value;
//    }
    static int findSize(SinglyLinkedListNode head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode h1 = head1;
        SinglyLinkedListNode h2 = head2;
        if (head1 != null && head2 != null){
            if (head1.data > head2.data){
                h1 = head2;
                h2 = head1;
            }
        }
        SinglyLinkedListNode copy = h2;
        SinglyLinkedListNode h1copy = h1;
        boolean is_break = false;
        while (h1 != null){
            h2 = copy;
            while (h2 != null){
                if (h1.next != null && h1.next.data >= h2.data) {
                    insertNode(h1, h2.data);
                    copy = copy.next;
                } else if (h1.next == null && h1.data < h2.data) {
                    h1.next = h2;
                    is_break = true;
                    break;
                }
                h2 = h2.next;
            }
            if (is_break){
                break;
            }
            h1 = h1.next;
        }
        return h1copy;
    }
    static void insertNode(SinglyLinkedListNode root, int data) {
        if (root == null){
            return;
        } else {
            if (root.next != null) {
                SinglyLinkedListNode tmp = root.next;
                root.next = new SinglyLinkedListNode(data);
                root.next.next = tmp;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        SinglyLinkedListNode head1 = new SinglyLinkedListNode(8);
        head1.next = new SinglyLinkedListNode(11);
        head1.next.next = new SinglyLinkedListNode(17);
        head1.next.next.next = new SinglyLinkedListNode(20);
        head1.next.next.next.next = new SinglyLinkedListNode(20);
        head1.next.next.next.next.next = new SinglyLinkedListNode(42);
        head1.next.next.next.next.next.next = new SinglyLinkedListNode(83);
        head1.next.next.next.next.next.next.next = new SinglyLinkedListNode(94);
        head1.next.next.next.next.next.next.next.next = new SinglyLinkedListNode(95);



        SinglyLinkedListNode head2 = new SinglyLinkedListNode(1);

        SinglyLinkedListNode n = mergeLists(head2, head1);
        printSinglyLinkedList(n);
    }
}
