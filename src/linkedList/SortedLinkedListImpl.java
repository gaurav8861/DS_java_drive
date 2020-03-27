package linkedList;

public class SortedLinkedListImpl {
	
	public static void main(String[] args) {
		 
		SortedLinkedList ll = new SortedLinkedList();
		ll.insert(12);
		ll.insert(13);
		ll.insert(100);
		ll.insert(9);
		ll.insert(2);
		ll.insert(34);
		
		System.out.println("##################### Before Reversal #####################");
		ll.print();
		
		System.out.println("##################### After Reversal #####################");
		ll.reverse();
		ll.print();
	}

}
