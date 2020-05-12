package BinaryTree;
/**
 *                             32
 *                          /     \
 *                        22         43
 *                      /          /   \
 *                    14         36     47
 *                                /   \ 
 *                               35    37
 *   
 *   
 */

public class CheckBinaryTreeIsBST {
	public static void main(String[] args) {
		Node root = new Node(32);
		root.leftNode = new Node(22);
		root.rightNode = new Node(43);
		root.leftNode.leftNode = new Node(14);
		root.leftNode.leftNode.rightNode = new Node(15);
		root.rightNode.leftNode = new Node(36);
		root.rightNode.rightNode = new Node(47);
		root.rightNode.leftNode.rightNode = new Node(37);
		root.rightNode.leftNode.leftNode = new Node(35);
		
		System.out.println("Check binary tree is BST : ");
		System.out.println(isBST(root));
	}

	private static boolean isBST(Node root) {
		if (root == null)
			return true;
		if (root.leftNode != null && root.leftNode.data > root.data)
			return false;
		if (root.rightNode != null && root.rightNode.data < root.data)
			return false;
		if(!isBST(root.leftNode) || !isBST(root.rightNode))
			return false;
		return true;
	}


}
