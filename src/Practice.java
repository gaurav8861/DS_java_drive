import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Practice {

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

        public SinglyLinkedList() {
            this.head = null;
        }


    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node) throws IOException {
        while (node != null) {
            System.out.println(node.data);

            node = node.next;
        }
    }

    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode n = head;
        if(head == null){
            return new SinglyLinkedListNode(data);
        }
        while(n != null){
            if(n.next == null){
                SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
                n.next = newNode;
                break;
            }else{
                n = n.next;
            }
        }
        return head;
    }
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode n = head;
        if (head == null){
            return new SinglyLinkedListNode(data);
        }
        int i = 1;
        while(i <= position && head != null){
            if(i == position){
                SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
                SinglyLinkedListNode tmp = head.next;
                head.next = newNode;
                newNode.next = tmp;
                break;
            }
            head = head.next;
            i++;
        }
        return n;
    }
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        SinglyLinkedListNode n = head;
        SinglyLinkedListNode prev = null;
        int i = 0;

        if (position == 0){
            return head.next;
        }
        while(i <= position && head != null){
            if(i == position && prev != null){
                SinglyLinkedListNode node = prev.next.next;
                prev.next = node;
            }
            prev = head;
            head = head.next;
            i++;
        }
        return n;
    }
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        while((head1 != null) && (head2 != null)){
            if(head1.data != head2.data){
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        if(head1 == null && head2 == null) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) throws IOException {
        SinglyLinkedList llist = new SinglyLinkedList();
        int[] llistCount = {1,2,3,4,5,6};

        for (int i = 0; i < llistCount.length; i++) {
            SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, llistCount[i]);

            llist.head = llist_head;
        }
        SinglyLinkedListNode head = llist.head;
//        while (llist.head != null){
//            if(llist.head.next == null){
//                llist.head.next = head;
//                break;
//            }
//            llist.head = llist.head.next;
//        }

//        SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, 100, 3);
//        printSinglyLinkedList(llist.head);
//        System.out.println("---------");
//        SinglyLinkedListNode llist_head1  = deleteNode(llist.head, 0);
//        printSinglyLinkedList(head);

//        SinglyLinkedList llist1 = new SinglyLinkedList();
//        int[] llistCount1 = {1,2,2,3,5, 6};
//
//        for (int i = 0; i < llistCount1.length; i++) {
//            SinglyLinkedListNode llist_head2 = insertNodeAtTail(llist1.head, llistCount1[i]);
//
//            llist1.head = llist_head2;
//        }
//
//        System.out.println("---------");
//        System.out.println(compareLists(llist.head, llist1.head));
//        printSinglyLinkedList(llist.head);

//        System.out.println("---------");
//        printSinglyLinkedList(llist.head);
//        System.out.println("reverse ---------");
//        SinglyLinkedListNode h = reverse(llist.head);
//        printSinglyLinkedList(h);
//        System.out.println(getNode(llist.head, 1));

//        System.out.println(reverse(llist.head));


        List<Integer> lst = Arrays.asList(1,2,3,4,5);
        System.out.println("Before ---------");
        System.out.println(lst);
        System.out.println("After ----------");
        System.out.println(rotateLeft(2, lst));
    }

    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        SinglyLinkedListNode pointer = head;
        SinglyLinkedListNode n = head;
        while(head != null){
            if(0 == positionFromTail){
                pointer = n;
            }
            positionFromTail--;
            if (head.next == null){
                pointer = pointer;
                break;
            }
            head = head.next;
            pointer = pointer.next;
        }
        return pointer.data;
    }

    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        SinglyLinkedListNode n = head;
        Map<Integer, Integer> map = new HashMap<>();
        SinglyLinkedListNode prev = null;
        while(head != null){
            if(map.get(head.data) != null){
                Boolean exit = true;
                while(exit){
                    if(head.next != null && map.get(head.next.data) != null){
                        head = head.next;
                    }else{
                        exit = false;
                    }
                }
                prev.next = head.next;
            }else{
                map.put(head.data, 0);
            }
            prev = head;
            head = head.next;
        }
        return n;
    }

    static boolean hasCycle(SinglyLinkedListNode head) {
        SinglyLinkedListNode node1 = head;
        SinglyLinkedListNode node2 = head;
        while(node1 != null && node2 != null){
            node1 = node1.next;
            if(node2.next != null){
                node2 = node2.next.next;
            }
            if(node1 == node2){
                return true;
            }
        }
        return false;
    }

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        SinglyLinkedListNode head = llist;
        SinglyLinkedListNode prev = null;

        while (llist != null){
            SinglyLinkedListNode tmp = llist.next;
            llist.next = prev;
            prev = llist;
            if (tmp != null)
                llist = tmp;
            else return llist;
        }
        return llist;
    }

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        if(d == 0){
            return arr;
        }
        for(int i = 0; i < d ; i++){
            int tmp = arr.get(0);
            for(int j =0 ; j< arr.size(); j++){
                if(j+1 <= arr.size()-1){
                    arr.set(j, arr.get(j+1));
                }
            }
            arr.set(arr.size()-1, tmp);
        }
        return arr;
    }

}
