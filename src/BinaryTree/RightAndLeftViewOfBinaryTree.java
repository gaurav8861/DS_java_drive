package BinaryTree;
/**
 * 							
 *                          1
 *                        /   \
 *                      2       3
 *                    /   \   /   \
 *                   4     5  6    7
 *                        /         \
 *                       8           9
 *                       
 *    Left view -  1, 2, 4, 8
 *    Right view - 1, 3, 7, 9
 */
import java.util.LinkedList;
import java.util.Queue;

public class RightAndLeftViewOfBinaryTree {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.leftNode = new Node(2);
		root.rightNode = new Node(3);
		root.leftNode.leftNode = new Node(4);
		root.leftNode.rightNode = new Node(5);
		root.rightNode.leftNode = new Node(6);
		root.rightNode.rightNode = new Node(7);
		root.rightNode.leftNode.rightNode = new Node(8);
		System.out.println("Right view of binary tree.");
		rightViewOfBinaryTree(root);
		System.out.println();
		
		System.out.println("Left view of binary tree.");
		leftViewOfBinaryTree(root);
	}

	private static void leftViewOfBinaryTree(Node root) {
		if (root == null)
			return;

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			int n = queue.size();
			for (int i = 1; i <= n; i++) {
				Node temp = queue.poll();
				if (i == 1)
					System.out.print(temp.data + " ");
				if (temp.leftNode != null)
					queue.add(temp.leftNode);
				if (temp.rightNode != null)
					queue.add(temp.rightNode);
			}
		}
	}

	private static void rightViewOfBinaryTree(Node root) {
		if (root == null)
			return;

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			int n = queue.size();
			for (int i = 1; i <= n; i++) {
				Node temp = queue.poll();
				if (i == n)
					System.out.print(temp.data + " ");
				if (temp.leftNode != null)
					queue.add(temp.leftNode);
				if (temp.rightNode != null)
					queue.add(temp.rightNode);
			}
		}
	}
}
