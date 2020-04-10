package BinaryTree;
/**
 *                             1
 *                          /     \
 *                        2         3
 *                      /  \      /   \
 *                    4     5    6     7
 *                                \ 
 *                                 8
 *   Leaf node : (4, 5, 8, 7) 
 *   Number    : 4
 */
import java.util.LinkedList;
import java.util.Queue;

public class LeafNodeInBinaryTree {
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.leftNode = new Node(2);
		root.rightNode = new Node(3);
		root.leftNode.leftNode = new Node(4);
		root.leftNode.rightNode = new Node(5);
		root.rightNode.leftNode = new Node(6);
		root.rightNode.rightNode = new Node(7);
		root.rightNode.leftNode.rightNode = new Node(8);
		
		System.out.println("Leaf Node in Binary Tree (Iterative way)");
		System.out.println(leafNodesInBinaryTreeIterative(root));
		
		System.out.println("Leaf Node in Binary Tree (Recursive way)");
		System.out.println(leafNodesInBinaryTreeRecursive(root));
	}

	private static int leafNodesInBinaryTreeRecursive(Node root) {
		if(root == null) {
			return 0;
		} else {
			int countL = leafNodesInBinaryTreeRecursive(root.leftNode);
			int countR = leafNodesInBinaryTreeRecursive(root.rightNode);
			if(root.leftNode == null && root.rightNode == null)
				return countL + countR + 1;
			else {
				return countL + countR;
			}
		}
		
	}

	private static int leafNodesInBinaryTreeIterative(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		int count = 0;
		if(root == null) {
			return 0;
		} else {
			queue.add(root);
			while(!queue.isEmpty()) {
				root = queue.peek();
				queue.remove();
				if(root.leftNode == null && root.rightNode == null) {
					count++;
				}
				if(root.leftNode != null) {
					queue.add(root.leftNode);
				}
				if(root.rightNode != null) {
					queue.add(root.rightNode);
				}
			}
		}
		return count;
	}

}
