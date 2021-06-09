import java.io.*;

public class SolutionDoublyLl {

    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    static class DoublyLinkedList {
        public DoublyLinkedListNode head;
        public DoublyLinkedListNode tail;

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
                node.prev = this.tail;
            }

            this.tail = node;
        }
    }

    public static void printDoublyLinkedList(DoublyLinkedListNode node) throws IOException {
        while (node != null) {
            System.out.println(node.data);

            node = node.next;
        }
    }


    public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
        // Write your code here
        DoublyLinkedListNode head = llist;


        while (llist != null){
            DoublyLinkedListNode tmp = llist.next;
            llist.next = llist.prev;
            llist.prev = tmp;

            llist = tmp;
            if (tmp != null){
                head = tmp;
            }
        }

        return head;

    }



    public static void main(String[] args) throws IOException{

        DoublyLinkedList ll = new DoublyLinkedList();
        ll.insertNode(1);
        ll.insertNode(2);
        ll.insertNode(3);
        ll.insertNode(4);

        printDoublyLinkedList(ll.head);

        DoublyLinkedListNode h = reverse(ll.head);
        System.out.println("----------------- reverse");
        printDoublyLinkedList(h);



    }
}
//    class Result {
//
//        /*
//         * Complete the 'sortedInsert' function below.
//         *
//         * The function is expected to return an INTEGER_DOUBLY_LINKED_LIST.
//         * The function accepts following parameters:
//         *  1. INTEGER_DOUBLY_LINKED_LIST llist
//         *  2. INTEGER data
//         */
//
//        /*
//         * For your reference:
//         *
//         * DoublyLinkedListNode {
//         *     int data;
//         *     DoublyLinkedListNode next;
//         *     DoublyLinkedListNode prev;
//         * }
//         *
//         */
//
//        public static DoublyLinkedListNode sortedInsert(SolutionDoublyLl.DoublyLinkedListNode llist, int data) {
//            // Write your code here
//            DoublyLinkedListNode head = llist;
//            if (llist == null) {
//                return new DoublyLinkedListNode(data);
//            }
//            while (llist != null) {
//                if (llist.data >= data) {
//                    DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
//                    newNode.next = llist;
//                } else {
//                    DoublyLinkedListNode tmp = llist.next;
//                    DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
//                    newNode.next = tmp;
//                    newNode.prev = llist;
//                    llist.next = newNode;
//                }
//                llist = llist.next;
//            }
//            return head;
//        }
//
//    }
//
//    public static void main(String[] args) throws IOException {
//        DoublyLinkedList ll = new DoublyLinkedList();
//        ll.insertNode(1);
//        ll.insertNode(2);
//        ll.insertNode(3);
//        ll.insertNode(4);
//
//
//
//        printDoublyLinkedList(ll.head);
//        DoublyLinkedListNode llist1 = new Result().sortedInsert(ll.head, 4);
//
//    }
