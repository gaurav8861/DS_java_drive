package BinaryTree;
/**
 *                             1
 *                          /     \
 *                        2         3
 *                      /  \      /   \
 *                    4     5    6     7
 *                             /   \ 
 *                            9     8
 *   
 *   Diameter - left subtree + right sub tree + 1
 */

public class DiameterOfBinaryTree {
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
		
		System.out.println("Diameter of binary tree: ");
		System.out.println(diameterOfBinaryTree(root));
	}

	private static int diameterOfBinaryTree(Node root) {
		if(root == null)
			return 0;
		else {
			int lh = heightOfBinaryTree(root.leftNode);
			int rh = heightOfBinaryTree(root.rightNode);
			
			int ld = diameterOfBinaryTree(root.leftNode);
			int rd = diameterOfBinaryTree(root.rightNode);
			
			return maxOfTwoNumbers(lh + rh + 1 , maxOfTwoNumbers(ld, rd));
		}
	}

	private static int heightOfBinaryTree(Node root) {
		if(root == null) {
			return 0;
		}
		else {
			int lh = heightOfBinaryTree(root.leftNode);
			int rh = heightOfBinaryTree(root.rightNode);
			
			return maxOfTwoNumbers(lh, rh) + 1;
		}
	}

	private static int maxOfTwoNumbers(int lh, int rh) {
		if(lh > rh) 
			return lh;
		else return rh;
		
	}

}
