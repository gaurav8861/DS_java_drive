package BinaryTree;

import java.util.Stack;

/**
 *
 *                             1
 *                          /     \
 *                        2         3
 *                      /  \      /   \
 *                    4     5    6     7
 *                             /   \ 
 *                            9     8
 *   
 *   Pre-Order Traversal(Iterative) : 1, 2, 4, 5, 3, 6, 9, 8, 7
 */

public class IterativePreorderTraversalofBinaryTree {
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
		
		System.out.println("Pre-order traversal in binary tree (Recursive)");
		preOrderTraversalRecursive(root);
		System.out.println();
		System.out.println("Pre-order traversal in binary tree (Iterative)");
		preOrderTraversalIterative(root);
	}

	private static void preOrderTraversalIterative(Node root) {
		Stack<Node> queue = new Stack<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			root = queue.pop();
			System.out.print(root.data + " ");
			if (root.rightNode != null) {
				queue.push(root.rightNode);
			}
			if (root.leftNode != null) {
				queue.push(root.leftNode);
			}
		}
	}

	private static void preOrderTraversalRecursive(Node root) {
		if(root == null)
			return;
		else {
			System.out.print(root.data + " ");
			preOrderTraversalRecursive(root.leftNode);
			preOrderTraversalRecursive(root.rightNode);
		}
	}

}
