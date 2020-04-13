/**
 * 							1
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
 * 							1
 *                        /   \
 *                       3      2
 *                     /   \   /  \
 *                   7     6  5    4
 *                  /          \     
 *                 9            8                              
 */

public class PracticeMirrorOfBinaryTree {
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.leftNode = new Node(2);
		root.rightNode = new Node(3);
		root.leftNode.leftNode = new Node(4);
		root.leftNode.rightNode = new Node(5);
		root.rightNode.leftNode = new Node(6);
		root.rightNode.rightNode = new Node(7);
		root.rightNode.rightNode.rightNode = new Node(9);
		root.leftNode.rightNode.leftNode = new Node(8);
		
		System.out.println("Before mirror");
		inOrderTraversal(root);
		System.out.println();
		
		mirrorOfBinaryTree(root);
		
		System.out.println("After mirror");
		inOrderTraversal(root);
		System.out.println();
	}

	private static void mirrorOfBinaryTree(Node root) {
		if(root == null)
			return;
		else {
			mirrorOfBinaryTree(root.leftNode);
			mirrorOfBinaryTree(root.rightNode);
			Node temp = root.leftNode;
			root.leftNode = root.rightNode;
			root.rightNode = temp;
		}
	}

	private static void inOrderTraversal(Node root) {
		if(root == null)
			return;
		else {
			inOrderTraversal(root.leftNode);
			System.out.print(root.data + ", ");
			inOrderTraversal(root.rightNode);
		}
	}

}
