package BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

class NodeCustom{
	int dis;
	Node n;
	public NodeCustom(Node n, int dis) {
		this.n = n;
		this.dis = dis;
	}
}

public class VerticalOrderTraversal {
	
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
		verticallevelOrderTraversal(root);
	}

	private static void verticallevelOrderTraversal(Node node) {
		if(node == null) {
			return;
		}
		Stack<Node> stackLIFO = new Stack<>();
		Map<Integer, List<Node>> mapList = new TreeMap<Integer,List<Node>>();
		Map<Node, Integer> horizontalDistance = new HashMap<Node, Integer>();
		stackLIFO.add(node);
		horizontalDistance.put(node, 0);
		addToListOfMapIfNotPresent(mapList, node, 0, true);
		while(!stackLIFO.isEmpty()) {
			node = stackLIFO.peek();
			stackLIFO.pop();
			if(node.leftNode != null) {
				stackLIFO.add(node.leftNode);
				horizontalDistance.put(node.leftNode, horizontalDistance.get(node)-1);
				addToListOfMapIfNotPresent(mapList, node.leftNode, horizontalDistance.get(node)-1, false);
			}
			if(node.rightNode != null) {
				stackLIFO.add(node.rightNode);
				horizontalDistance.put(node.rightNode, horizontalDistance.get(node)+1);
				addToListOfMapIfNotPresent(mapList, node.rightNode, horizontalDistance.get(node)+1, false);
			}
		}
		for (Integer name : mapList.keySet()) {  
			for (int i = 0; i < mapList.get(name).size(); i++) {
				System.out.print(mapList.get(name).get(i).data + " ");
			}
		}
		
	}

	private static void addToListOfMapIfNotPresent(Map<Integer, List<Node>> mapList, Node currentNode, int distance, boolean firstTime) {
		List<Node> listOfNodes = null;
		if(keyAlreadyExists(distance, mapList)) {
			listOfNodes = mapList.get(distance);
			listOfNodes.add(currentNode);
		}else {
			listOfNodes = new ArrayList<>();
			listOfNodes.add(currentNode);
			mapList.put(distance, listOfNodes);
		}
		if(firstTime) {
			listOfNodes = new ArrayList<>();
			listOfNodes.add(currentNode);
			mapList.put(distance, listOfNodes);
		}
	}

	private static boolean keyAlreadyExists(int distance, Map<Integer, List<Node>> mapList) {
		for (Integer keyDistance : mapList.keySet()) {
			if(keyDistance == distance){
				return true;
			}
		}
		return false;
	}

}
