package BinaryTree;



/**
 * prerequisite : postOrderTraversal
 * 					LeftNode - RightNode - RootNode
 *                             1
 *                          /     \
 *                        2         3
 *                      /  \      /   \
 *                    4     5    6     7
 *                                      \ 
 *                                       8
 *    Height = 4
 *
 */

public class HeightOfBinaryTree {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.leftNode = new Node(2);
		root.rightNode = new Node(3);
		root.leftNode.leftNode = new Node(4);
		root.leftNode.rightNode = new Node(5);
		root.rightNode.leftNode = new Node(6);
		root.rightNode.rightNode = new Node(7);
		root.rightNode.leftNode.rightNode = new Node(8);
		
		System.out.println("Height of binary tree.");
		System.out.println(heightOfBinaryTree(root));
	}

	private static int heightOfBinaryTree(Node root) {
		if(root == null) {
			return 0;
		} else {
			int lh = heightOfBinaryTree(root.leftNode);
			int rh = heightOfBinaryTree(root.rightNode);
			if(lh > rh) {
				return lh + 1;
			} else {
				return rh + 1;
			}
		}
	}
}
