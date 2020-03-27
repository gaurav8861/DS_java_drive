package linkedList;

public class LinkedListImpl {
	
	public static void main(String[] args) throws Exception {
		
		LinkedList ll = new LinkedList();
		ll.insert(12);
		ll.insert(13);
		ll.insert(9);
		ll.insert(100);
		/*ll.insert(9);
		ll.insert(2);
		ll.insert(9);
		ll.insert(34);*/
		ll.insert(100);
		ll.insert(9);
		ll.insert(13);
		ll.insert(12);
		
		
		/*Node n1 = ll.getNodeRef(34);
		Node n2 = ll.getNodeRef(100);
		System.out.println("################## Last Node Reference ##################");
		System.out.println(n1.next.next);
		System.out.println(n2.next.data);
		n1.next.next = n2.next;*/
		
		/*System.out.println("################## Before Deletion ##################");
		ll.print(ll.getHead());*/
		
		/*ll.delete(100);
		System.out.println("After deletion of particular node");
		ll.print(ll.getHead());*/
		
		//System.out.println("################## Size of the LinkedList is ##################");
		//System.out.println(ll.lenght());
		
		//System.out.println("################## Before Deletion By position ##################");
		//ll.deleteByPosition(2);
		
		/*ll.deleteNthNodeFromEnd(2);
		System.out.println("################## After Deletion By position ##################");
		ll.print(ll.getHead());*/
		
		/*System.out.println("################## Middle Element ##################");
		ll.middle();*/
		
		/*System.out.println("################## Number of occurence ##################");
		System.out.println(ll.countNumberOfOccurence(9));*/
		
		
		System.out.println("################## Detect Loop ##################");
		System.out.println(ll.detectLoop());
		
		System.out.println("################## Number of elements in loop ##################");
		System.out.println(ll.detectAndCountLoop());
		
		System.out.println("################## Is palindrome ##################");
		System.out.println(ll.checkPalindrome());
		
		
		
	}
}
