package BinaryTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class TopViewLevelOrderTraversal {
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.leftNode = new Node(2);
		root.rightNode = new Node(3);
		root.leftNode.leftNode = new Node(4);
		root.leftNode.rightNode = new Node(5);
		root.leftNode.leftNode.leftNode = new Node(6);
		root.leftNode.rightNode.rightNode = new Node(7);
		root.rightNode.rightNode = new Node(8);
		root.rightNode.rightNode.rightNode = new Node(9);
		
		System.out.println("Vertical Level Order Traversal");
		topViewLevelOrderTraversal(root);
	}

	private static void topViewLevelOrderTraversal(Node root) {
		Stack<Node> stackLIFO = new Stack<>();
		Map<Integer, Node> map = new TreeMap<Integer, Node>();
		Map<Node, Integer> horizontalDistance = new HashMap<Node, Integer>();
		stackLIFO.add(root);
		horizontalDistance.put(root, 0);
		addElementInMap(map, root, 0);
		while(!stackLIFO.isEmpty()) {
			root = stackLIFO.peek();
			stackLIFO.pop();
			if(root.leftNode != null) {
				stackLIFO.add(root.leftNode);
				horizontalDistance.put(root.leftNode, horizontalDistance.get(root)-1);
				addElementInMap(map, root.leftNode, horizontalDistance.get(root)-1);
			}
			if(root.rightNode != null) {
				stackLIFO.add(root.rightNode);
				horizontalDistance.put(root.rightNode, horizontalDistance.get(root)+1);
				addElementInMap(map, root.rightNode, horizontalDistance.get(root)+1);
			}
		}
		System.out.println("Top view Order Traversal");
		for(Integer key : map.keySet()) {
			System.out.print(map.get(key).data + " ");
		}
	}

	private static void addElementInMap(Map<Integer, Node> map, Node root, int horizontalDistance) {
		if(!map.containsKey(horizontalDistance)) {
			map.put(horizontalDistance, root);
		}
	}

}
