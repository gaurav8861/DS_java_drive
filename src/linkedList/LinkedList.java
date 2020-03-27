package linkedList;

import java.util.HashSet;

public class LinkedList {
	
	private Node head;
	
	class Node {
		public int data;
		public Node next;	
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	private Node previousNode;
	
	public void insert(int data) {
		
		if(head == null) {
			head = new Node();
			head.data = data;
			head.next = null;
		}else {
			Node n = head;
			while(n != null) {
				previousNode = n;
				n = n.next;
			}
			n = new Node();
			previousNode.next = n;
			n.data = data;
			n.next = null;
		}
	}
	
	public void print(Node head) {
		while(head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
	
	public void delete(int data) {
		Node n = getNodeRef(data);
		//System.out.println("Node found at : " + n.data);
		if(n == null) {
			System.out.println("Deletion Node not found........");
		}else {
			n.next = n.next.next;
		}
	}

	public Node getNodeRef(int data) {
		Node n = head;
		Node previousNode = null;
		while(n != null) {
			if(n.data == data) {
				return previousNode;
			}
			previousNode = n;
			n = n.next;
		}
		return null;
	}
	
	static int count;
	public int lenght() {
		count = 0;
		Node n = head;
		while(n != null) {
			++count;
			n = n.next;
		}
		return count;
	}
	
	public void deleteByPosition(int position) {
		count = 1;
		Node n = head;
		while(n != null) {
			if(count == position) {
				delete(n.data);
			}
			count++;
			n = n.next;
		}
	}
	
	public void deleteNthNodeFromEnd(int nthNode) {
		int l = lenght();
		l = l-nthNode+1;
		deleteByPosition(l);
	}
	
	public void middle() throws Exception {
		int l = lenght();
		if(l % 2 == 0) {
			System.out.println(findByPosition(l/2 + 1));
		}else {
			System.out.println(findByPosition(l/2 + 1));
		}
	}
	
	public int findByPosition(int position) throws Exception {
		count = 1;
		Node n = head;
		while(n != null) {
			if(count == position) {
				return n.data;
			}
			count++;
			n = n.next;
		}
		throw new Exception("Element not found");
	}
	
	public int countNumberOfOccurence(int key) {
		count = 0;
		Node n = head;
		while(n != null) {
			if(n.data == key) {
				count++;
			}
			n = n.next;
		}
		return count;
	}

	HashSet<Node> set = null;
	public boolean detectLoop() {
		set = new HashSet<Node>();
		Node n = head;
		while(n != null) {
			if(set.contains(n)) {
				return true;
			}
			set.add(n);
			n = n.next;
		}
		return false;
	}
	
	public int detectAndCountLoop() {
		
		Node slow_p = head;
		Node fast_p = head;
		
		while(slow_p != null && fast_p != null && fast_p.next != null) {
			
			slow_p = slow_p.next;
			fast_p = fast_p.next.next;
			
			if(slow_p == fast_p) {
				return countLoopElements(slow_p);
			}
			
			
		}
		return 0;
		
	}

	private int countLoopElements(Node slow_p) {
		Node n = slow_p;
		int count = 1;
		n = n.next;
		while(n != null) {
			if(slow_p == n) {
				return count;
			}
			++count;
			n = n.next;
		}
		return count;
	}
	
	public boolean checkPalindrome() {
		Node n = head;
		String str = "";
		while(n != null) {
			str += n.data+"";
			n = n.next;
		}
		return isPalindrome(str);
	}

	private boolean isPalindrome(String str) {
		if(str.length() == 0 || str.length() == 1) {
			return true;
		}
		if(str.charAt(0) == str.charAt(str.length()-1)) {
			return isPalindrome(str.substring(1, str.length()-1));
		}
		return false;
	}
}











