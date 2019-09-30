import java.util.Scanner;

public class SelecttionSort {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Array Length: ");
		int arraylength = scanner.nextInt();

		System.out.println("Array Elements: ");
		int array[] = new int[arraylength];

		for (int i = 0; i < arraylength; i++) {
			array[i] = scanner.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			int temp = array[i];
			int index = i;

			for (int j = i; j < array.length; j++) {
				if (temp > array[j] && temp != array[j]) {
					temp = array[j];
					index = j;
				}

			} // end for loop

			array[index] = array[i];
			array[i] = temp;

			// for tracking every movement
			// System.out.print("\nAfter Sorting : ");
			// for (int j = 0; j < array.length; j++) {
			// System.out.print(array[j] + " ");
			// }
		}

		System.out.print("\nAfter Sorting : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		scanner.close();
	}

}
