package Stack;

public class CorrectStackImplementation {

	/*Has to be 
	 * 
	 * 27(top) --> 100 --> 89 --> 43 --> 4 --> 12 --> null
	 * 
	 */
	
	Node top = null;
	
	public void pop() {
		if(top == null) {
			System.out.println("Empty Stack");
		} else {
			top = top.next;
		}
	}
	
	public void push(int item) {
		createNewNode(item);
	}
	
	private Node createNewNode(int item) {
		Node newNode = new Node(item);
		newNode.next = top;
		top = newNode;
		return top;
	}
	
	public void peek() {
		if(top == null) {
			System.out.println("Empty Stack");
		} else {
			System.out.println(top.data);
		}
	}
	
	public void isEmpty() {
		if(top == null) {
			System.out.println(true);
		} else { 
			System.out.println(false);
		}
	}

	public int size() {
		Node topIterator = top;
		return sizeOfStackRecursive(topIterator);
	}
	int count = 0;
	private int sizeOfStackRecursive(Node topIterator) {
		if(topIterator != null) {
			count ++;
			sizeOfStackRecursive(topIterator.next);
		}
		return count;
	}
	
	public String displayNodeItems() {
		Node topIterator = top;
		String str = "";
		return "[ " + displayNodeItemsRecursive(topIterator, str) + " ]";
	}

	private String displayNodeItemsRecursive(Node topIterator, String str) {
		if(topIterator != null)
			str = str + topIterator.data + "," + displayNodeItemsRecursive(topIterator.next, str);
		return str;
	}
}
