import java.util.LinkedList;
import java.util.Queue;

/**
 *                             1
 *                          /     \
 *                        2         3
 *                      /  \      /   \
 *                    4     5    6     7
 *                                \ 
 *                                 8
 *   Leaf node : (4, 5, 8, 7)
 */
public class PracticeLeafNodeInBinaryTree {
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.leftNode = new Node(2);
		root.rightNode = new Node(3);
		root.leftNode.leftNode = new Node(4);
		root.leftNode.rightNode = new Node(5);
		root.rightNode.leftNode = new Node(6);
		root.rightNode.rightNode = new Node(7);
		root.rightNode.leftNode.rightNode = new Node(8);
		
		System.out.println("Leaf Node (Iterative way): ");
		System.out.println(leafNodeIterative(root));
		
		System.out.println("Leaf Node (Recursive way): ");
		System.out.println(leafNodeRecursive(root));
	}

	private static int leafNodeRecursive(Node root) {
		if(root == null) {
			return 0;
		} else if(root.leftNode == null && root.rightNode == null){
			return 1;
		}else {
			int lcount = leafNodeRecursive(root.leftNode);
			int rcount = leafNodeRecursive(root.rightNode);
			return lcount + rcount;
		}
	}

	private static int leafNodeIterative(Node root) {
		int count = 0;
		if(root == null) {
			return 0;
		} else {
			Queue<Node> queue = new LinkedList<Node>();
			queue.add(root);
			while(!queue.isEmpty()) {
				root = queue.peek();
				queue.remove();
				if(root.leftNode != null)
					queue.add(root.leftNode);
				if(root.rightNode != null)
					queue.add(root.rightNode);
				if(root.leftNode == null && root.rightNode == null)
					count++;
			}
		}
		return count;
	}
}