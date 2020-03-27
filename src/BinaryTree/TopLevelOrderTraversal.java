package BinaryTree;

import java.util.*;

public class TopLevelOrderTraversal {
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.leftNode = new Node(2);
		root.rightNode = new Node(3);
		root.leftNode.leftNode = new Node(4);
		root.leftNode.rightNode = new Node(5);
		root.leftNode.leftNode.leftNode = new Node(6);
		root.leftNode.rightNode.rightNode = new Node(7);
		root.rightNode.rightNode = new Node(8);
		root.rightNode.rightNode.rightNode = new Node(9);
		
		System.out.println("Level Order Traversal");
		levelOrderTraversal(root);
	}

	private static void levelOrderTraversal(Node n) {
		if(n == null) {
			return;
		}
		Queue<Node> queue = new LinkedList<>();
		queue.add(n);
		while(!queue.isEmpty()) {
			n = queue.peek();
			System.out.print(n.data + " ");
			queue.remove();
			if(n.leftNode != null) {
				queue.add(n.leftNode);
			}
			if(n.rightNode != null) {
				queue.add(n.rightNode);
			}
		}
	}

}
