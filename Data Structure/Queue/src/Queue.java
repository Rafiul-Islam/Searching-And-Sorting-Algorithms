
public class Queue {

	int[] array = new int[5];
	int top = 0;
	int size = 0;

	public void add(int data) {

		if (top < array.length) {
			array[top] = data;
			top++;
		} else {
			System.out.println("Error: Queue is Overloaded");
		}

	}

	public void show() {
		top--;
		System.out.print("Elements : ");
		for (int i : array) {
			if (i == 0) {

			} else {
				System.out.print(i + " ");
			}

		}
	}

	public int peek() {
		if (size < top) {
			return array[size];
		} else {
			System.out.println("Queue is empty. So peek operation can't be done");
		}
		return 0;
	}

	public void offer(int data) {
		if (top < array.length) {
			array[top] = data;
			top++;
		} else {
			System.out.println("Error: Queue is Overloaded");
		}

	}

	public int poll() {
		int data = 0;
		if (size < top) {
			data = array[size];
			array[size] = 0;
			System.out.println("Poll completed from index " + size + " & value :" + data);
			size++;
		} else {
			System.out.println("Queue is empty. So poll operation can't be done");
		}

		return data;

	}

	public boolean isEmpty() {
		boolean result = false;
		if (size > top - 1) {
			result = true;
		}
		// System.out.println(size);
		return result;
	}

	public int size() {
		return top - size;

	}

	public void remove() {
		int data = 0;
		if (size < top) {
			data = array[size];
			array[size] = 0;
			System.out.println("Data Deleted");
			size++;
		} else {
			System.out.println("Queue is empty. So poll operation can't be done");
		}

	}

}
