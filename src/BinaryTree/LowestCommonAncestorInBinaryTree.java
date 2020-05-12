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
 *   LCA (8, 9) = 6
 *
 */

public class LowestCommonAncestorInBinaryTree {
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
		System.out.println("In Order Traversal in binary tree");
		inOrderTraversal(root);
		System.out.println();
		
		int num1 = 9;
		int num2 = 7;
		System.out.println("Lowest common ancestor of " + num1 + " and " + num2);
		Node n = lowestCommonAncestor(root, num1, num2);
		System.out.println(n.data);
	}

	private static Node lowestCommonAncestor(Node root, int num1, int num2) {
		if(root == null) {
			return root;
		}
		if(root.data == num1 || root.data == num2) {
			return root;
		}
		Node left = lowestCommonAncestor(root.leftNode, num1, num2);
        Node right = lowestCommonAncestor(root.rightNode,num1, num2);
        if(left != null && right != null){
            return root;
        }
        return ((left == null) ? right : left);
	}

	private static void inOrderTraversal(Node root) {
		if(root == null)
			return;
		else {
			inOrderTraversal(root.leftNode);
			System.out.print(root.data + " ");
			inOrderTraversal(root.rightNode);
		}
	}

}
