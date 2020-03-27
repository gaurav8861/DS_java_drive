package problem1;

/**
 * 
 * @author gauravkumar
 * 
 * 	Add 1 to a number represented as linked list
	Number is represented in linked list such that each digit corresponds to a node in linked list. Add 1 to it. 
	For example 1999 is represented as (1-> 9-> 9 -> 9) and adding 1 to it should change it to (2->0->0->0)
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.insert(1);
		ll.insert(9);
		ll.insert(9);
		ll.insert(9);
		System.out.println("################### Before reversal ##################");
		ll.print();
		ll.reverse();
		System.out.println("################### After reversal ##################");
		ll.print();
		Node head = ll.head;
		
		System.out.println("################### After adding one to the number ##################");
		ll.addOneToLinkedList(head, 1);
		
		ll.print();
	}

}
