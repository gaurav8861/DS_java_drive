package BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 *   						1
 *   					  /	  \
 *						2		3
 *					  /	 \	  /   \
 *					4     5  6     7
 *							  \     \
 *								8    9
 *
 *	Boundary of binary tree : 1, 2, 4, 5, 8, 9, 7, 3
 *                            left(1,2) - leaf(4, 5, 8, 9) - reverse right(7, 3)
 */

public class BoundaryOfBinaryTreeTraversal {
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.leftNode = new Node(2);
		root.rightNode = new Node(3);
		root.leftNode.leftNode = new Node(4);
		root.leftNode.rightNode = new Node(5);
		root.rightNode.leftNode = new Node(6);
		root.rightNode.rightNode = new Node(7);
		root.rightNode.rightNode.rightNode = new Node(9);
		root.rightNode.leftNode.rightNode = new Node(8);
		
		List<Node> sets = new ArrayList<Node>();
		
		preOrderTraversal(root, sets);
		
		leafNodeOfBinaryTree(root, sets);
		
		inOrderTraversal(root.rightNode, sets);
		
		for (Node node : sets) {
			System.out.print(node.data + " ");
		}
	}

	private static void inOrderTraversal(Node root, List<Node> sets) {
		if(root == null) {
			return ;
		} else if(root.leftNode == null && root.rightNode == null){
			return;
		}else {
			inOrderTraversal(root.rightNode, sets);
			sets.add(root);
		}
	}

	private static void preOrderTraversal(Node root, List<Node> sets) {
		if(root == null) {
			return ;
		} else if(root.leftNode == null && root.rightNode == null){
			return;
		}else {
			sets.add(root);
			preOrderTraversal(root.leftNode, sets);
		}
	}

	private static void leafNodeOfBinaryTree(Node root, List<Node> sets) {
		if(root == null) {
			return;
		} else if(root.leftNode == null && root.rightNode == null){
			sets.add(root);
		}else {
			leafNodeOfBinaryTree(root.leftNode, sets);
			leafNodeOfBinaryTree(root.rightNode, sets);
		}
	}

}
