import java.util.LinkedList;
import java.util.Queue;

/**
 * 							1
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
public class PracticeLeftAndRightViewOfBinaryTree {
	
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
		
		System.out.println("Left view of binary tree : ");
		leftViewOfBinaryTree(root);
		System.out.println();
		
		System.out.println("Right view of binary tree : ");
		rightViewOfBinaryTree(root);
	}

	private static void rightViewOfBinaryTree(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		if(root == null)
			return;
		else { 
			queue.add(root);
			while(!queue.isEmpty()) {
				int n = queue.size();
				for (int i = 1; i <= n; i++) {
					root = queue.peek();
					queue.remove();
					if(i == n)
						System.out.print(root.data + " ");
					if(root.leftNode != null)
						queue.add(root.leftNode);
					if(root.rightNode != null)
						queue.add(root.rightNode);
				}
			}
		}
	}

	private static void leftViewOfBinaryTree(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		if(root == null) {
			return;
		} else {
			queue.add(root);
			while(!queue.isEmpty()) {
				int n = queue.size();
				for (int i = 0; i < n; i++) {
					root = queue.peek();
					queue.remove();
					if(i == 0) {
						System.out.print(root.data + " ");
					}
					if(root.leftNode != null)
						queue.add(root.leftNode);
					if(root.rightNode != null)
						queue.add(root.rightNode);
				}
			}
		}
	}

}
