package BinaryTree;
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class DiagonalViewOrderTraversal {
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.leftNode = new Node(2);
		root.rightNode = new Node(3);
		root.leftNode.leftNode = new Node(4);
		root.leftNode.rightNode = new Node(5);
		root.rightNode.leftNode = new Node(6);
		root.rightNode.rightNode = new Node(7);
		root.rightNode.leftNode.rightNode = new Node(8);
		
		System.out.println("Diagonal view of binary tree.");
		diagonalViewOfBinaryTree(root);
	}

	private static void diagonalViewOfBinaryTree(Node root) {
		Map<Node, Integer> mapIndex = new HashMap<Node, Integer>();
		Map<Integer, List<Node>> resultSet = new TreeMap<Integer, List<Node>>();
		if(root == null) {
			return;
		} else {
			Queue<Node> queue = new LinkedList<Node>();
			queue.add(root);
			mapIndex.put(root, 0);
			addElementToResultMap(root, 0, resultSet);
			while(!queue.isEmpty()) {
				root = queue.peek();
				queue.remove();
				if(root.leftNode != null) {
					mapIndex.put(root.leftNode, mapIndex.get(root) + 1);
					queue.add(root.leftNode);
					addElementToResultMap(root.leftNode, mapIndex.get(root) + 1, resultSet);
				}
				if(root.rightNode != null) {
					mapIndex.put(root.rightNode, mapIndex.get(root));
					queue.add(root.rightNode);
					addElementToResultMap(root.rightNode, mapIndex.get(root), resultSet);
				}
			}
			for (Integer key : resultSet.keySet()) {
				for (Node node : resultSet.get(key)) {
					System.out.print(node.data + " ");
				}
				System.out.println();
			}
		}
	}

	private static void addElementToResultMap(Node root, int hd, Map<Integer, List<Node>> resultSet) {
		if(resultSet.containsKey(hd)) {
			List<Node> listOfNodes = resultSet.get(hd);
			listOfNodes.add(root);
		} else {
			List<Node> listOfNodes = new ArrayList<Node>();
			listOfNodes.add(root);
			resultSet.put(hd, listOfNodes);
		}
	}

}
