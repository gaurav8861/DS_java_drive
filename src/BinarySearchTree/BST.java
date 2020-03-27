package BinarySearchTree;

public class BST {
	
	Node head;
	
	public void insert(int data) {
		if(head == null) {
			head = new Node(null, data, null);
		}else {
			insert(data, head);
		}
	}

	private Node insert(int data, Node root) {
		if (root != null && root.leftNode != null && data < root.data) 
            root.leftNode = addNodeLeft(data, root.leftNode); 
        else if (root != null && root.rightNode != null && data > root.data) 
            root.rightNode = addNodeRight(data, root.rightNode); 
        return root;
	}
	
	private Node addNodeLeft(int data, Node leftNode) {
		return leftNode.leftNode = new Node(null, data, null);
	}
	private Node addNodeRight(int data, Node rightNode) {
		return rightNode.rightNode = new Node(null, data, null);
	}

	public void printNodes() {
		Node n = head;
		while(n != null) {
			n = n.leftNode;
		}
		while(n != null) { 
			if(n.leftNode != null) {
				System.out.println(n.data);
			}else if(n.rightNode != null){
				System.out.println(n.data);
			}else {
				System.out.println(n.data);
			}
		}
	}
}
