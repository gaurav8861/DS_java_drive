package SwapNodes;

/**
 * 
 * @author gauravkumar
 * 
 * 	Swap nodes in a linked list without swapping data
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
		ll.swap(6, 15);
		ll.print();
		
	}

}
