
public class mainClass {

	public static void main(String[] args) {

		// Stack stack = new Stack();
		// stack.push(10);
		// stack.push(20);
		// stack.push(30);
		// stack.push(40);
		// stack.push(50);
		// stack.push(60);
		//
		// System.out.println("Size: " + stack.size());
		// stack.show();
		//
		// System.out.println("Peek : " + stack.peek());
		//
		// stack.pop();
		// System.out.println("Size: " + stack.size());
		// System.out.println("Peek : " + stack.peek());
		// stack.pop();
		// System.out.println("Size: " + stack.size());
		// System.out.println("Peek : " + stack.peek());
		// stack.pop();
		// System.out.println("Size: " + stack.size());
		// stack.pop();
		// System.out.println("Size: " + stack.size());
		//
		// System.out.println("Peek : " + stack.peek());
		//
		// stack.show();
		// System.out.println("isEmpty : " + stack.isEmpty());

		//----------------------------------------------------------------------------
		
		//for dynamic array
		Dstack stack = new Dstack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);

		System.out.println("Size: " + stack.size());
		stack.show();

		System.out.println("Peek : " + stack.peek());

		stack.pop();
		System.out.println("Size: " + stack.size());
		System.out.println("Peek : " + stack.peek());
		stack.pop();
		System.out.println("Size: " + stack.size());
		System.out.println("Peek : " + stack.peek());
		stack.pop();
		System.out.println("Size: " + stack.size());
		stack.pop();
		System.out.println("Size: " + stack.size());

		System.out.println("Peek : " + stack.peek());

		stack.show();
		System.out.println("isEmpty : " + stack.isEmpty());

	}

}
