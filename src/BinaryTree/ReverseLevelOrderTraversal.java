package BinaryTree;

import java.util.*;

public class ReverseLevelOrderTraversal {
	
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
		reverselevelOrderTraversal(root);
	}

	private static void reverselevelOrderTraversal(Node n) {
		if(n == null) {
			return;
		}
		Queue<Node> queueFIFO = new LinkedList<>();
		Stack<Node> stackLIFO = new Stack<>();
		queueFIFO.add(n);
		while(!queueFIFO.isEmpty()) {
			n = queueFIFO.peek();
			stackLIFO.add(n);
			queueFIFO.remove();
			if(n.rightNode != null) {
				queueFIFO.add(n.rightNode);
			}
			if(n.leftNode != null) {
				queueFIFO.add(n.leftNode);
			}
		}
		while(!stackLIFO.isEmpty()) {
			System.out.print(stackLIFO.pop().data + " ");
		}
	}

}
