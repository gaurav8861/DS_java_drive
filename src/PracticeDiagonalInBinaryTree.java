import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 *                          1
 *                        /   \
 *                      2       3
 *                    /   \   /   \
 *                   4     5  6    7
 *                        /         \
 *                       8           9
 *
 * 		Diagonal view : 1, 3, 7, 9, 2, 5, 6, 4, 8 
 */
public class PracticeDiagonalInBinaryTree {
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
		
		System.out.println("Diagonal view of binary tree : ");
		diagonalViewOfBinaryTree(root);
	}

	private static void diagonalViewOfBinaryTree(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		Map<Node, Integer> hd = new HashMap<Node, Integer>();
		Map<Integer, List<Node>> result = new HashMap<Integer, List<Node>>();
		if(root == null)
			return;
		else {
			queue.add(root);
			hd.put(root, 0);
			addElementInResultMap(result, 0, root);
			while(!queue.isEmpty()) {
				root = queue.peek();
				queue.remove();
				if(root.leftNode != null) {
					queue.add(root.leftNode);
					hd.put(root.leftNode, hd.get(root) + 1);
					addElementInResultMap(result, hd.get(root.leftNode), root.leftNode);
				}
				if(root.rightNode != null) {
					queue.add(root.rightNode);
					hd.put(root.rightNode, hd.get(root));
					addElementInResultMap(result, hd.get(root.rightNode), root.rightNode);
				}
			}
		}
		for (Integer key : result.keySet()) {
			for (Node Node : result.get(key)) {
				System.out.print(Node.data + " ");
			}
			System.out.println();
		}
	}

	private static void addElementInResultMap(Map<Integer, List<Node>> result, int hd, Node Node) {
		if(result.containsKey(hd)) {
			List<Node> listOfNodes = result.get(hd);
			listOfNodes.add(Node);
		}else {
			List<Node> listOfNodes = new ArrayList<Node>();
			listOfNodes.add(Node);
			result.put(hd, listOfNodes);
		}
	}

}
