package BinarySearchTree;

class Node {

	Node leftNode;
	int data;
	Node rightNode;

}

class BST {

	public void inOrderTraversal(Node root) {
		if (root == null)
			return;
		else {
			inOrderTraversal(root.leftNode);
			System.out.print(root.data + " ");
			inOrderTraversal(root.rightNode);
		}
	}

	public Node insertNode(Node root, int val) {
		if (root == null) {
			return createNewNode(val);
		} else if (root.data > val) {
			root.leftNode = insertNode(root.leftNode, val);
		} else if (root.data < val) {
			root.rightNode = insertNode(root.rightNode, val);
		}
		return root;
	}

	private Node createNewNode(int val) {
		Node n = new Node();
		n.data = val;
		n.leftNode = null;
		n.rightNode = null;
		return n;
	}

	public Node deleteNode(Node node, int value) {

		if (node == null) {
			return node;
		}

		if (node.data > value) {
			node.leftNode = deleteNode(node.leftNode, value);
		}else if (node.data < value) {
			node.rightNode = deleteNode(node.rightNode, value);
		}else {
			if (node.leftNode == null) {
				// one child - right and Leaf node 
				return node.rightNode;
			}else if (node.rightNode == null) {
				// one child - left
				return node.leftNode;
			}
			// two children
			node.data = findMinRightSubTree(node.rightNode);
			node.rightNode = deleteNode(node.rightNode, node.data);
		}
		return node;
	}
	

	private int findMinRightSubTree(Node node) {
		Node minimum = node;
		if (node.leftNode != null) {
			minimum = node.leftNode;
			findMinRightSubTree(node.leftNode);
		}
		return minimum.data;
	}

	public void searchNode(Node root, int value) throws Exception {
		if(root == null) {
			System.out.println("Not found");
		}
		else {
			if(root.data == value) {
				System.out.println("Element found!!!!!");
			} else if(root.data < value) {
				searchNode(root.rightNode, value);
			} else {
				searchNode(root.leftNode, value);
			}
		}
	}

	public Node lowestCommonAncestor(Node root, int num1, int num2) {
		if(root == null) {
			return root;
		}
		if(num1 > root.data && num2 > root.data) {
			return lowestCommonAncestor(root.rightNode, num1, num2);
		} 
		else if(num1 < root.data && num2 < root.data) {
			return lowestCommonAncestor(root.leftNode, num1, num2);
		} 
		return root;
	}
}
