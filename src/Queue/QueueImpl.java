package Queue;

import Stack.Node;

public class QueueImpl {
	
	Node last = null;
	Node first = null;
	
	// Add an item to the end of the list
	public void add(int item) { 
		createNewNode(item);
	}
	
	private Node createNewNode(int item) {
		Node newNode = new Node(item);
		if(last == null) {
			first = last = newNode;
		}else {
			last.next = newNode;
			last = last.next;
		}
		return first;
	}

	// Remove the first item in the list
	public void remove() {
		if(first != null) {
			first = first.next;
		}
	}
	
	// Return the top of the queue
	public void peek () {
		if(first != null) {
			System.out.println(first.data);
		}else {
			System.out.println("Empty Queue");
		}
	}
	
	//Return true if and only if the queue is empty
	public boolean isEmpty() {
		if(first == null) {
			return true;
		}
			return false;
	}


}
