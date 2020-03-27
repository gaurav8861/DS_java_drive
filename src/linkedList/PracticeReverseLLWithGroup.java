package linkedList;

public class PracticeReverseLLWithGroup {
	
	public static void main(String[] args) {
		LinkedListImp n = new LinkedListImp();
		n.push(1);
		n.push(2);
		n.push(3);
		n.push(4);
		n.push(5);
		n.push(6);
		n.push(7);
		n.push(8);
		
		System.out.println("Before Reversing");
		n.printNodesInLL(n.head);
		
		Nod afterReversal = reverseLinkedListWithGroup(3, n.head);
		
	}

	private static Nod reverseLinkedListWithGroup(int i, Nod head) {
		
		return head;
	}

}
class Nod{
	int data;
	Nod next;
	
	public Nod(int data) {
		this.data = data;
	}
	
}
class LinkedListImp{
	Nod head = null;
	Nod n = null;

	public LinkedListImp() {
	}
	public void printNodesInLL(Nod head2) {
		while(head2 != null) {
			System.out.print(head2.data + " ");
			head2 = head2.next;
		}
		System.out.println();
	}
	public void push(int data) {
		if(head == null) {
			head = new Nod(data);
			n = head;
		}else {
			Nod newNode = new Nod(data);
			n.next = newNode;
			n = newNode;
		}
	}
}
