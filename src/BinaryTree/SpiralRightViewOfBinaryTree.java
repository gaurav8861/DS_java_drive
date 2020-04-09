package BinaryTree;
/**
 *                          1
 *                        /   \
 *                      2       3
 *                    /   \   /   \
 *                   4     5  6    7
 *                        /         \
 *                       8           9
 *                       
 *             Spiral View of binary tree - (1, 3, 2, 4, 5, 6, 7, 9, 8)
*/

import java.util.Stack;

public class SpiralRightViewOfBinaryTree {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.leftNode = new Node(2);
		root.rightNode = new Node(3);
		root.rightNode.rightNode = new Node(5);
		root.rightNode.rightNode.leftNode = new Node(6);
		root.rightNode.rightNode.rightNode = new Node(7);
		root.leftNode.leftNode = new Node(4);
		root.leftNode.rightNode = new Node(8);
		
		System.out.println("Spiral order traversal");
		spiralRightOrderTraversal(root);
	}

	private static void spiralRightOrderTraversal(Node root) {
		Stack<Node> stack1 = new Stack<>();
		Stack<Node> stack2 = new Stack<>();
		if(root == null) {
			return;
		}else {
			stack1.push(root);
			while(!stack1.isEmpty() || !stack2.isEmpty()) {
				while(!stack1.isEmpty()) {
					root = stack1.peek();
					System.out.println(stack1.pop().data);
					if(root.leftNode != null) {
						stack2.push(root.leftNode);
					}
					if(root.rightNode != null) {
						stack2.push(root.rightNode);
					}
				}
				while(!stack2.isEmpty()) {
					root = stack2.peek();
					System.out.println(stack2.pop().data);
					if(root.rightNode != null) {
						stack1.push(root.rightNode);
					}
					if(root.leftNode != null) {
						stack1.push(root.leftNode);
					}
				}
			}
		}
	}
}
