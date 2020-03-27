package BinaryTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class BottomViewLevelOrderTraversal {
	
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
		bottomViewLevelOrderTraversal(root);
	}

	private static void bottomViewLevelOrderTraversal(Node root) {
		Stack<Node> stack = new Stack<>();
		Map<Integer, Node> map = new TreeMap<Integer, Node>();
		Map<Node, Integer> horizontalDistance = new HashMap<Node, Integer>();
		stack.add(root);
		horizontalDistance.put(root, 0);
		addElementToMap(map, root, 0);
		while(!stack.isEmpty()) {
			root = stack.peek();
			stack.pop();
			if(root.leftNode != null) {
				stack.add(root.leftNode);
				horizontalDistance.put(root.leftNode, horizontalDistance.get(root)-1);
				addElementToMap(map, root.leftNode, horizontalDistance.get(root)-1);
			}
			if(root.rightNode != null) {
				stack.add(root.rightNode);
				horizontalDistance.put(root.rightNode, horizontalDistance.get(root)+1);
				addElementToMap(map, root.rightNode, horizontalDistance.get(root)+1);
			}
		}
		for(Integer key : map.keySet()) {
			System.out.print(map.get(key).data + " ");
		}
	}

	private static void addElementToMap(Map<Integer, Node> map, Node root, int hd) {
		map.put(hd, root);
	}

}
