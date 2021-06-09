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
 *   Size - 9
 */

public class SizeOfBinaryTree {
	
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
		
		System.out.println(size(root));
		
	}

	private static int size(Node node) {
		if(node == null) {
			return 0;
		}else {
				return size(node.leftNode) + 1 + size(node.rightNode);
		}
	}

}
