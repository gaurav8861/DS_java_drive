package BinaryTree;

import java.util.Stack;

/**
 *                             1
 *                          /     \
 *                        2         3
 *                      /  \      /   \
 *                    4     5    6     7
 *                             /   \ 
 *                            9     8
 *   
 *   PostOrder Traversal(Iterative) : 4, 5, 2, 9, 8, 6, 7, 3, 1
 */

public class IterativePostorderUsingStack {
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.leftNode = new Node(2);
		root.rightNode = new Node(3);
		root.leftNode.leftNode = new Node(4);
		root.leftNode.rightNode = new Node(5);
		root.rightNode.leftNode = new Node(6);
		root.rightNode.rightNode = new Node(7);
		root.rightNode.leftNode.rightNode = new Node(8);
		root.rightNode.leftNode.leftNode = new Node(9);
		
		System.out.println("Postorder traversal in binary tree");
		postOrderTraversalIterative(root);
	}

	private static void postOrderTraversalIterative(Node root) {
		Stack<Node> stack = new Stack<>();
		if(root == null)
			return;
		else {
			stack.add(root);
			while(!stack.isEmpty()) {
				root = stack.peek();
				stack.pop();
				
				while(root.leftNode != null) {
					root = root.leftNode;
				}
				stack.add(root);
				
				while(root.rightNode != null) {
					root = root.rightNode;
				}
			}
		}
	}

}
