/*package BST;

public class BST { 
	
	private Node root;
	
	public BST() {
		root = null;
	}
	
	public class Node{
		
		private Node lc;
		private Person data;
		private Node rc;
		
	}
	
	public boolean insert(Person p) {
		if(root == null) {
			Node n = new Node();
			n.data = p;
			n.lc = null;
			n.rc = null;
			root = n;
			return true;
		}
		Node n1 = root;
		Node n2 = n1;
		while(n2 != null) {
			if(n2.data.getName().compareTo(p.getName()) > 0){
				
				Node n = new Node();
				n.data = p;
				n.lc = n2;
				
			}else {
				
				Node n = new Node();
				n.data = p;
				n.rc = n2;
				
			}
		}
		
	}
	
} 

*/