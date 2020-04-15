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
 *   Non-leaf node - 1, 2, 3, 6
 */
public class NonLeafNodeInBinaryTree {
	
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
		
		System.out.println("Non-leaf node in binary tree");
		System.out.println(nonLeafNodeInBinaryTree(root));
	}

	private static int nonLeafNodeInBinaryTree(Node root) {
		if (root == null || (root.leftNode == null && root.rightNode == null))
			return 0;

		return 1 + nonLeafNodeInBinaryTree(root.leftNode) + nonLeafNodeInBinaryTree(root.rightNode);
	}
}
