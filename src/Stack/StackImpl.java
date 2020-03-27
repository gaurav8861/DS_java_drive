package Stack;

/**
 * Implemented As
 * 12 --> 4 --> 43 --> 89 --> 100 --> 27(top) --> null
 *
 * Has to be 
 * 27(top) --> 100 --> 89 --> 43 --> 4 --> 12 --> null 
 */


public class StackImpl {
	
	Node stackHead = null;
	Node firstNode = null;
	Node newNode = null;
	Node previousNode = null;
	
	public void pop() {
		if(stackHead == null) {
			System.out.println("Stack is empty.");
		}else {
			if(previousNode != null) {
				stackHead = previousNode;
				previousNode.next = null;
			} else if(previousNode == null && newNode != null){
				stackHead = firstNode;
				firstNode.next = null;
			}else {
				stackHead = null;
			}
		}
		
	}
	
	public void push(int item) {
		System.out.println("Inserting element : " + item);
		stackHead = createNewNode(item);
	}
	
	private Node createNewNode(int item) {
		if(stackHead == null) {
			firstNode = new Node(item);
			stackHead = firstNode;
		}else { 
			previousNode = newNode;
			newNode = new Node(item);
			stackHead.next = newNode;
			stackHead = newNode;
		}
		return stackHead;
	}
	
	public void peek() {
		System.out.println(stackHead == null ? "Empty Stack" : stackHead.data);
	}
	
	public void isEmpty() {
		if(stackHead == null) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	
}
