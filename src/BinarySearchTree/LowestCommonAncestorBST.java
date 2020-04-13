package BinarySearchTree;
/**
 * 							 20
 *                         /    \
 *                        8      22
 *                      /   \
 *                     4     12
 *                          /  \
 *                         10   14 
 *                     
 */                    

public class LowestCommonAncestorBST {

	public static void main(String[] args) {
		
		BST bst = new BST();
		Node root = null;
		root = bst.insertNode(root, 20);
		root = bst.insertNode(root, 8);
		root = bst.insertNode(root, 22);
		root = bst.insertNode(root, 4);
		root = bst.insertNode(root, 12);
		root = bst.insertNode(root, 10);
		root = bst.insertNode(root, 14);
		
		bst.inOrderTraversal(root);
		System.out.println();
		
		int num1 = 10;
		int num2 = 14;
		
		System.out.println("Lowest common ancestor of " + num1 + " and " + num2);
		
		// Lowest common Ancestor in binary search tree
		Node node = bst.lowestCommonAncestor(root, num1, num2);
		System.out.println(node.data);
	}

}
