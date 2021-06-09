package BinarySearchTree;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		/**
		 * 				8
		 * 			   / \
		 * 			 /     \
		 * 			3	     10
		 * 		   / \		   \
		 * 		  /   \          \
		 * 		1		6	      13
		 *             / \         \
		 *            /   \         \
 		 * 		     4		7	    14
		 * 
		 */
		
		Node root = null;
		BST bst = new BST();
		root = bst.insertNode(root, 16);
		root = bst.insertNode(root, 6);
		root = bst.insertNode(root, 2);
		root = bst.insertNode(root, 12);
		root = bst.insertNode(root, 20);
		root = bst.insertNode(root, 26);
		root = bst.insertNode(root, 28);
		
		root = bst.insertNode(root, 13);
		root = bst.insertNode(root, 15);
				
		root = bst.insertNode(root, 8);
		root = bst.insertNode(root, 14);
		
		
		System.out.println("- - - - - - - - - - Before deleting - - - - - - - - - -");
		// Print node data
		bst.inOrderTraversal(root);
		System.out.println();
		
//		// Deleting 6 
//		bst.deleteNode(root, 8);
//		//bst.deleteRec(root, 12);
//		
//		System.out.println("- - - - - - - - - - After deleting - - - - - - - - - -");
//		bst.inOrderTraversal(root);
//		System.out.println();
		
//		System.out.println("- - - - - - - - - - Searching node - - - - - - - - - -");
//		bst.searchNode(root, 26);


		System.out.println(checkBST(root));

		Node root1 = new Node(10);
		root1.leftNode = new Node(11);

		System.out.println(checkBST(root1));
	}
		public static boolean checkBST(Node root) {
			if (root == null){
				return false;
			}
			return checkBSTre(root);
		}
	public static boolean checkBSTre(Node root) {
		if ((root.leftNode != null) && (root.data < root.leftNode.data)){
			return false;
		}
		else if ((root.rightNode != null) && (root.data > root.rightNode.data)){
			return false;
		}else {
			if (root.leftNode != null)
				checkBSTre(root.leftNode);
			if (root.rightNode != null)
				checkBSTre(root.rightNode);
			return true;
		}
	}
}