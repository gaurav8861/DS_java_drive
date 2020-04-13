import java.util.Stack;

/**
 * 							1
 *                        /   \
 *                      2       3
 *                    /   \   /   \
 *                   4     5  6    7
 *                        /         \
 *                       8           9
 *                       
 *             Spiral View of binary tree - (1, 3, 2, 4, 5, 6, 7, 9, 8)
*/

public class PracticeSpiralViewOfBinaryTree {
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
		
		System.out.println("Spiral view of binary tree");
		spiralViewOfBinaryTree(root);
	}

	private static void spiralViewOfBinaryTree(Node root) {
		Stack<Node> stack1 = new Stack<Node>();
		Stack<Node> stack2 = new Stack<Node>();
		if(root == null) {
			return;
		} else {
			stack1.push(root);
			while(!stack1.isEmpty() || !stack2.isEmpty()) {
				while(!stack1.isEmpty()) {
					root = stack1.peek();
					System.out.print(root.data + " ");
					stack1.pop();
					if(root.leftNode != null) {
						stack2.add(root.leftNode);
					}
					if(root.rightNode != null) {
						stack2.add(root.rightNode);
					}
				}
				while(!stack2.isEmpty()) {
					root = stack2.peek();
					System.out.print(root.data + " ");
					stack2.pop();
					if(root.rightNode != null) {
						stack1.add(root.rightNode);
					}
					if(root.leftNode != null) {
						stack1.add(root.leftNode);
					}
				}
			}
		}
		
	}

}
