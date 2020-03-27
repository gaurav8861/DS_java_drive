package linkedList;

/**
 * Given a linked list, write a function to reverse every k nodes (where k is an input to the function).
 */

/**
 * Example:
 * Input: 1->2->3->4->5->6->7->8->NULL, K = 3
 * Output: 3->2->1->6->5->4->8->7->NULL
 * Input: 1->2->3->4->5->6->7->8->NULL, K = 5
 * Output: 5->4->3->2->1->8->7->6->NULL
 */

public class ReverseALinkedListInGroupsOfGivenSize {
	

	public static void main(String[] args) {
		Node n7 = new Node(8, null);
		Node n6 = new Node(7, n7);
		Node n5 = new Node(6, n6);
		Node n4 = new Node(5, n5);
		Node n3 = new Node(4, n4);
		Node n2 = new Node(3, n3);
		Node n1 = new Node(2, n2);
		Node head = new Node(1, n1);
		
		int k = 3;
		Node n = reverseNode(head, k);
		while(n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	private static Node reverseNode(Node head, int k) {
		Node currentNode = head;
		int count = 0; 
		Node nextNode = null;
		Node prevNode = currentNode;
		
		while(currentNode.next != null && count < k) {
			nextNode = currentNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
	        count++; 
		}
		if (nextNode != null)  
	          head.next = reverseNode(nextNode, k); 
		return prevNode;
	}

}
class Node{
	int data;
	Node next;
	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}
