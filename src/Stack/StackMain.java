package Stack;

public class StackMain {
	
	public static void main(String[] args) {
		
		StackImpl stack = new StackImpl();
		
		System.out.println("------------------------- Pushing elements in stack ------------------------- ");
		
		stack.push(12);
		stack.push(4);
		stack.push(43);
		stack.push(89);
		stack.push(100);
		stack.push(27);
		
		System.out.println("------------------------- Popping out elements in stack ------------------------- ");
		stack.pop();
		
		System.out.println("------------------------- Peek elements in stack ------------------------- ");
		stack.peek();
		
		System.out.println("------------------------- Is stack Empty? ------------------------- ");
		stack.isEmpty();
		
		
		
	}

}
