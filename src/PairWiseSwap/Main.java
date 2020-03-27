package PairWiseSwap;

/**
 * 
 * @author gauravkumar
 * 
 * 	Pairwise swap elements of a given linked list
 * 	Given a singly linked list, write a function to swap elements pairwise. 
 * For example, if the linked list is 1->2->3->4->5 then the function should change it to 2->1->4->3->5, 
 * and if the linked list is 1->2->3->4->5->6 then the function should change it to 2->1->4->3->6->5.
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.insert(3);
		ll.insert(6);
		ll.insert(9);
		ll.insert(15);
		ll.insert(30);
		ll.insert(16);
		ll.insert(35);
		
		System.out.println("################### Before Swapping ##################");
		ll.print();
		System.out.println();
		System.out.println("################### After Swapping ##################");
		//ll.swap(6, 15);
		ll.pairWiseSwap();
		ll.print();
		
	}

}
