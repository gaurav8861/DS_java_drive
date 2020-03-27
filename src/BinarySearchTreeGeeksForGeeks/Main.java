package BinarySearchTreeGeeksForGeeks;

public class Main {
	
	public static void main(String[] args) {
		
		/**
		 * 				8
		 * 			   / \
		 * 			 /     \
		 * 			3	     10
		 * 		   / \		   \
		 * 		  /   \          \
		 * 		1		6	      14
		 *             / \        /
		 *            /   \      /
 		 * 		     4		7	13
		 * 
		 */
		
		Node root = null;
		BSTImpl bst = new BSTImpl();
		root = bst.insertNewNode(root, 8);
		root = bst.insertNewNode(root, 3);
		root = bst.insertNewNode(root, 1);
		root = bst.insertNewNode(root, 6);
		root = bst.insertNewNode(root, 10);
		root = bst.insertNewNode(root, 13);
		root = bst.insertNewNode(root, 14);
		root = bst.insertNewNode(root, 4);
		root = bst.insertNewNode(root, 7);
		System.out.println("- - - - - - - - - - Before deleting - - - - - - - - - -");
		// Print node data
		bst.inOrderTraversal(root);
		
		// Deleting 1 
		bst.deleteNode(root, 1);
		
		System.out.println("- - - - - - - - - - After deleting 1 - - - - - - - - - -");
		bst.inOrderTraversal(root);
		
		
	}

}
