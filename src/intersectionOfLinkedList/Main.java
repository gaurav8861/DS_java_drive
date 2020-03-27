package intersectionOfLinkedList;

/**
 * 
 * @author gauravkumar
 * 
 * 	Write a function to get the intersection point of two Linked Lists.
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.insert(3);
		ll.insert(6);
		ll.insert(9);
		ll.insert(15);
		ll.insert(9);
		ll.insert(6);
		ll.insert(30);
//		Node n2 = ll.getNodeRef(15);
//		System.out.println(n2.data);
		
//		LinkedList ll1 = new LinkedList();
//		ll1.insert(10);
//		Node n1 = ll1.getNodeRef(10);
//		System.out.println(n1.data);
//		n1.next = n2;
		
		System.out.println("################### Linked list 1 ##################");
		ll.print();
		
//		System.out.println("################### Linked list 2 ##################");
//		ll1.print();
		
//		System.out.println("Diference of length of two linked list");
//		System.out.println(diff);
		
		Node head1 = ll.head;
		//Node head2 = ll1.head;
		
//		int n = ll.getIntersectedNode(head1, head2);
//		System.out.println("################### Intersected Node ##################");
//		System.out.println(n);
		
		System.out.println("################### After Removing Duplicate ##################");
		ll.removeDuplicate(head1);
		ll.print();
		
	}

}
