
public class Dstack {

	int capacity = 2;
	int[] array = new int[capacity];
	int top = 0;
	int finalIndex = 0;

	public void push(int data) {

		if (size() == capacity) {
			expand();
		}
		array[top] = data;
		top++;

	}

	private void expand() {

		int length = size();

		int[] newStack = new int[capacity * 2];
		System.arraycopy(array, 0, newStack, 0, length);
		array = newStack;
		capacity *= 2;

	}

	public void show() {

		int index = top;

		if (index > (array.length - 1)) {
			index--;
		}
		if (index < (array.length - 1)) {
			index--;
		}

		for (int i = 0; i <= index; i++) {
			System.out.print(array[i] + " ");
		}
		if (top == 0) {
			System.out.println("Stack is Empty. Can't Show Any Element");
		}
		System.out.println();

	}

	public int peek() {

		int data = 0;
		if (top <= 0) {
			System.out.println("Stack is Empty. Can't peek !");
		} else {
			data = array[top - 1];
		}

		return data;
	}

	public int size() {
		return top;
	}

	public boolean isEmpty() {
		if (top <= 0) {
			return true;
		} else {
			return false;
		}

	}

	public int pop() {

		int index = 0;
		int data = 0;
		if (top <= 0) {
			System.out.println("Stack is Empty. Can't pop !");
		} else {
			index = top - 1;

			data = array[index];
			array[index] = 0;
			top = top - 1;
			System.out.println("Pop Done from index " + top + " Value : " + data);

		}
		return data;

	}

}
