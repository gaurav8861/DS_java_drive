package intersectionOfLinkedList;

import java.util.HashSet;

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
	
	public Node getNodeRef(int data) {
		Node n = head;
		if(n.data == data) {
			return head;
		}
		while(n.next != null) {
			if(n.data == data) {
				return n;
			}
			n = n.next;
		}
		return null;
	}

	public int length(Node n) {
		int count = 0;
		if(n == null) {
			return 0;
		}
		while(n != null) {
			++count;
			n = n.next;
		}
		return count;
	}
	public int getIntersectedNode(Node head1, Node head2) {
		int l1 = length(head1);
		int l2 = length(head2);
		
		Node fastPointer = null;
		Node slowPointer = null;
		
		int d = (l1 -l2) > 0 ? (l1 - l2) : (l2 - l1);
		
		if(l1>l2) {
			fastPointer = head1;
			slowPointer = head2;
		}else {
			fastPointer = head2;
			slowPointer = head1;
		}
		for (int i = 0; i < d; i++) {
			fastPointer = fastPointer.next;
		}
		Node sPointer = slowPointer;
		while(fastPointer != null) {
			sPointer = slowPointer;
			while(sPointer != null) {
				if(fastPointer.data == sPointer.data) {
					return sPointer.data;
				}
				sPointer = sPointer.next;
			}
			fastPointer = fastPointer.next;
		}
		return 0;
	}
	
	HashSet<Integer> set = null;
	Node previous = null;
	public void removeDuplicate(Node head) {
		Node n = head;
		set = new HashSet<Integer>();
		while(n != null) {
			System.out.println(" -- n.data --  " + n.data);
			if(set.contains(n.data)) {
				previous.next = n.next;
			}else {
				previous = n;
			}
			set.add(n.data);
			n = n.next;
		}
	}
}










