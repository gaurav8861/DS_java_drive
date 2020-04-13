import java.util.LinkedList;
import java.util.Queue;

/**
 *                             1
 *                          /     \
 *                        2         3
 *                      /  \      /   \
 *                    4     5    6     7
 *                             /   \ 
 *                            9     8
 *   Number of nodes : 9 (1, 2, 3, 4, 5, 6, 7, 8, 9) 
 */
public class PracticeNumberOfNodesInTree {
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

		System.out.println("Number of nodes in binary tree (Iterative way).");
		System.out.println(numberOfNodesinBinaryTreeIterative(root));

		System.out.println("Number of nodes in binary tree (Recursive way).");
		System.out.println(numberOfNodesinBinaryTreeRecursive(root));

	}

	private static int numberOfNodesinBinaryTreeRecursive(Node root) {
		if(root == null)
			return 0;
		else {
			int cl = numberOfNodesinBinaryTreeRecursive(root.leftNode);
			int cr = numberOfNodesinBinaryTreeIterative(root.rightNode);
			return cl + cr + 1;
		}
	}

	private static int numberOfNodesinBinaryTreeIterative(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		int count = 0;
		if(root == null)
			return 0;
		else {
			queue.add(root);
			while(!queue.isEmpty()) {
				root = queue.peek();
				count++;
				queue.remove();
				if(root.leftNode != null)
					queue.add(root.leftNode);
				if(root.rightNode != null)
					queue.add(root.rightNode);
			}
		}
		return count;
	}
}
