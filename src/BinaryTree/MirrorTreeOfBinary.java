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
 *                       
 *              MIRROR of above binary tree 
 *              
 *                          1
 *                        /   \
 *                       3      2
 *                     /   \   /  \
 *                   7     6  5    4
 *                  /          \     
 *                 9            8                              
 */

public class MirrorTreeOfBinary {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.leftNode = new Node(3);
		root.rightNode = new Node(2);
		root.rightNode.leftNode = new Node(5);
		root.rightNode.rightNode = new Node(4);
		
		System.out.println("Before mirror");
		inOrderTraversal(root);
		System.out.println();
		
		System.out.println("Mirror of Binary Tree");
		mirrorOfBinaryTree(root);
		
		System.out.println("After mirror");
		inOrderTraversal(root);
	}

	private static void inOrderTraversal(Node root) {
		if(root == null) {
			return;
		} else {
			inOrderTraversal(root.leftNode);
			System.out.print(root.data + " ");
			inOrderTraversal(root.rightNode);
		}
	}

	private static void mirrorOfBinaryTree(Node root) {
		if(root == null) {
			return;
		}else {
			mirrorOfBinaryTree(root.leftNode);
			mirrorOfBinaryTree(root.rightNode);
			Node temp = root.leftNode;
			root.leftNode = root.rightNode;
			root.rightNode = temp;
			
		}
	}

}
