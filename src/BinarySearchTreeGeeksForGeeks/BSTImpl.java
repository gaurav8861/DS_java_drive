package BinarySearchTreeGeeksForGeeks;

public class BSTImpl {
	
	public Node insertNewNode(Node n, int data) {
		
		if(n == null) {
			return createNewNode(data);
		}
		if(n.data > data) {
			n.leftNode = insertNewNode(n.leftNode, data);
		}else if(n.data < data){
			n.rightNode = insertNewNode(n.rightNode, data);
		}
		return n;
		
	}

	private Node createNewNode(int data) {
		Node n = new Node();
		n.data = data;
		n.leftNode = null;
		n.rightNode = null;
		return n;
	}

	public void inOrderTraversal(Node root) {
		if (root != null) { 
			inOrderTraversal(root.leftNode); 
            System.out.println(root.data); 
            inOrderTraversal(root.rightNode); 
        } 
		
	}

	public void deleteNode(Node root, int data) {
		
		if(root.data > data) {
			root.leftNode = searchInOrderTraversal(root.leftNode, data);
		}else if(root.data < data){
			root.rightNode = searchInOrderTraversal(root.rightNode, data);
		}
	}

	private Node searchInOrderTraversal(Node leftNode, int data) {
		// TODO Auto-generated method stub
		return null;
	}

}
