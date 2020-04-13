
/**
 *   						1
 *   					  /	  \
 *						2		3
 *					  /	 \	  /   \
 *					4     5  6     7
 *							  \     \
 *								8    9
 *
 *	Boundary of binary tree : 1, 2, 4, 5, 8, 9, 7, 3
 *                            left(1,2) - leaf(4, 5, 8, 9) - reverse right(7, 3)
 */
public class PrcaticeBoundaryOfBinaryTree {
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.leftNode = new Node(2);
		root.rightNode = new Node(3);
		root.leftNode.leftNode = new Node(4);
		root.leftNode.rightNode = new Node(5);
		root.rightNode.leftNode = new Node(6);
		root.rightNode.rightNode = new Node(7);
		root.rightNode.rightNode.rightNode = new Node(9);
		root.rightNode.leftNode.rightNode = new Node(8);
		
		System.out.println("Left elements except leaf");
		leftElementsExceptLeaf(root);
		System.out.println();
		
		System.out.println("Right elements except leaf and root");
		rightElementsExceptLeafAndRoot(root.rightNode);
		System.out.println();
		
		System.out.println("Leaf elements");
		leafNode(root);
		System.out.println();
	}

	private static void leafNode(Node root) {
		if(root == null)
			return;
		else if(root.leftNode == null && root.rightNode == null){
			System.out.print(root.data + " ");
		} else {
			leafNode(root.leftNode);
			leafNode(root.rightNode);
		}
	}

	private static void rightElementsExceptLeafAndRoot(Node root) {
		if(root == null)
			return;
		else {
			rightElementsExceptLeafAndRoot(root.rightNode);
			if(root.rightNode != null || root.leftNode != null)
				System.out.print(root.data + " ");
		}
	}

	private static void leftElementsExceptLeaf(Node root) {
		if(root == null)
			return;
		else {
			if(root.leftNode != null && root.rightNode != null)
				System.out.print(root.data + " ");
			leftElementsExceptLeaf(root.leftNode);
		}
	}
}
