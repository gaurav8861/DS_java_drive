package Queue;

public class Main {
	
	public static void main(String[] args) {
		
		QueueImpl queue = new QueueImpl();
		// Adding 12
		queue.add(12);
		queue.add(3);
		queue.add(67);
		queue.add(1);
		queue.add(90);
		queue.add(48);
		queue.add(23);
		queue.add(49);
		queue.add(62);
		
		System.out.println("********************************* Peek Item of the Queue *********************************");
		queue.peek();
		
		System.out.println("******************************* Removing Item of the Queue *******************************");
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		
		System.out.println("********************************* Peek Item of the Queue *********************************");
		queue.peek();
		
		
		System.out.println("********************************* Is Queue is Empty *********************************");
		System.out.println(queue.isEmpty());
		
		
	}

}
