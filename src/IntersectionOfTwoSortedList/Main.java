package IntersectionOfTwoSortedList;

/**
 * 
 * @author gauravkumar
 * 
 * 	Intersection of two Sorted Linked Lists
 *	Given two lists sorted in increasing order, create and return a new list representing the intersection of the two lists. 
 *	The new list should be made with its own memory — the original lists should not be changed.
 *	For example, let the first linked list be 1->2->3->4->6 and second linked list be 2->4->6->8, then your function should create and return a third list as 2->4->6.
 */

public class Main {
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.insert(6);
		
		System.out.println("################### 1st LikedList ##################");
		ll.print();
		
		LinkedList ll1 = new LinkedList();
		ll1.insert(2);
		ll1.insert(4);
		ll1.insert(6);
		ll1.insert(8);
		System.out.println("################### 2nd LinkedList ##################");
		ll1.print();
		
		System.out.println("################### Intersection of two linked lists ##################");
		LinkedList head = ll.intersectionOfTwoSortedLinkedList(ll.head, ll1.head);
		head.print();
		
		
		
	}

}
