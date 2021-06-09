package BinarySearchTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *	Binary Tree to Binary Search Tree Conversion
 *	SolutionDoublyLl
	Following is a 3 step solution for converting Binary tree to Binary Search Tree.
		1) Create a temp array arr[] that stores inorder traversal of the tree. This step takes O(n) time.
		2) Sort the temp array arr[]. Time complexity of this step depends upon the sorting algorithm. 
		In the following implementation, Quick Sort is used which takes (n^2) time. This can be done in O(nLogn) time using Heap Sort or Merge Sort.
		3) Again do inorder traversal of tree and copy array elements to tree nodes one by one. This step takes O(n) time. 
 */

/**
 * 
Input:
          10
         /  \
        2    7
       / \
      8   4
      
Output:
          8
         /  \
        4    10
       / \
      2   7
 *
 */

public class BTree2BSearchTreeConversion {
	public static void main(String[] args) {
		Node root = new Node(10);
		root.leftNode = new Node(2);
		root.leftNode.leftNode = new Node(8);
		root.leftNode.rightNode = new Node(4);
		root.rightNode = new Node(7);
		
		BinaryTreeToBinarySearchConversion(root);
	}

	private static void BinaryTreeToBinarySearchConversion(Node root) {
		List<Integer> listOfNodes = new ArrayList<Integer>();
		
		extractNodesFromTreeToArray(listOfNodes, root);
		System.out.println("Before sorting : ");
		printListOfNodes(listOfNodes);
		Collections.sort(listOfNodes, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 > o2) return 1;
				else if(o1 < o2) return -1;
				else return 0;
			}
		});
		System.out.println("After sorting: ");
		printListOfNodes(listOfNodes);
		copyIntoBinarySearchTreeFromArrayBYInorderTraversal(listOfNodes, root);
		System.out.println("Copy array into tree :");
		InOrderTraversal(root);
	}

	private static void InOrderTraversal(Node root) {
		if(root == null)
			return;
		else {
			InOrderTraversal(root.leftNode);
			System.out.print(root.data + " ");
			InOrderTraversal(root.rightNode);
		}
	}

	private static void copyIntoBinarySearchTreeFromArrayBYInorderTraversal(List<Integer> listOfNodes, Node root) {
		if(root == null) return;
		else {
			copyIntoBinarySearchTreeFromArrayBYInorderTraversal(listOfNodes, root.leftNode);
			root.data = listOfNodes.get(0);
			listOfNodes.remove(0);
			copyIntoBinarySearchTreeFromArrayBYInorderTraversal(listOfNodes, root.rightNode);
		}
	}

	private static void printListOfNodes(List<Integer> listOfNodes) {
		for (Integer node : listOfNodes) {
			System.out.print(node + " ");
		}
		System.out.println();
	}

	private static List<Integer> extractNodesFromTreeToArray(List<Integer> listOfNodes, Node root) {
		if (root == null)
			return null;
		else {
			extractNodesFromTreeToArray(listOfNodes, root.leftNode);
			listOfNodes.add(root.data);
			extractNodesFromTreeToArray(listOfNodes, root.rightNode);
		}
		return listOfNodes;
	}

}
