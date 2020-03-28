package BinaryTree;

public class PreAndPostAndInOrderTraversal {
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.leftNode = new Node(2);
		root.rightNode = new Node(3);
		root.leftNode.leftNode = new Node(4);
		root.leftNode.rightNode = new Node(5);
		
		System.out.println("PreOrder Traversal");
		preOrderTraversal(root);
		System.out.println();
		
		Node root1 = new Node(1);
		root1.leftNode = new Node(2);
		root1.rightNode = new Node(5);
		root1.leftNode.leftNode = new Node(3);
		root1.leftNode.rightNode = new Node(4);
		System.out.println("InOrder Traversal");
		inOrderTraversal(root1);
		System.out.println();
		
		System.out.println("PostOrder Traversal");
		postOrderTraversal(root1);
		
	}

	private static void preOrderTraversal(Node root) {
		if(root == null) {
			return;
		}
		else {
			System.out.print(root.data + " ");
			preOrderTraversal(root.leftNode);
			preOrderTraversal(root.rightNode);
		}
	}
	private static void inOrderTraversal(Node root) {
		if(root == null) {
			return;
		}
		else {
			inOrderTraversal(root.leftNode);
			System.out.print(root.data + " ");
			inOrderTraversal(root.rightNode);
		}
	}
	private static void postOrderTraversal(Node root) {
		if(root == null) {
			return;
		}
		else {
			postOrderTraversal(root.leftNode);
			postOrderTraversal(root.rightNode);
			System.out.print(root.data + " ");
		}
	}

}
