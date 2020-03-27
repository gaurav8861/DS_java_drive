package problem1;

public class LinkedList {
	
	public Node head;
	
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
	public void addOneToLinkedList(Node head, int num) {
		Node node = head;
		int carry = num;
		int sum = 0;
		while(node != null) {
			sum = (node.data + carry);
			node.data = sum % 10;
			carry = sum / 10;
			node = node.next;
		}
		
		if(head != null) {
			reverse();
		}
	}

}
