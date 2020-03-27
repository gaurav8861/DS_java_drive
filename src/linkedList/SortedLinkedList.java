package linkedList;

public class SortedLinkedList {
	
	private Node head;
	
	class Node {
		int data;
		Node next;
		
		public Node() {
		}
		public Node(int data) {
			this.data = data;
		}
	}

	public void insert(int data) {
		if(head == null) {
			head = new Node();
			head.data = data;
		}else {
			Node n = head;
			while(n.next != null){
				n = n.next;
			}
			n.next = new Node(data);
		}
	}
	public void print() {
		Node n = head;
		while(n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
	
	public void reverse() {
		
		Node previous = null;
		Node next = null;
		Node current = head;
		
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
	}
	
}















