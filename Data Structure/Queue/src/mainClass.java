import javax.management.Query;

public class mainClass {

	public static void main(String[] args) {

		Queue queue = new Queue();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		 //queue.add(50);
		// queue.add(60);
		queue.offer(50);
		
		queue.poll();
		queue.poll();
//		queue.poll();
//		queue.poll();
//		queue.poll();
//		queue.poll();
		
		queue.remove();
		
		System.out.println("Size: "+queue.size());

		System.out.println("Peek : " + queue.peek());
		
		System.out.println("isEmpty: " + queue.isEmpty());

		queue.show();

	}

}
