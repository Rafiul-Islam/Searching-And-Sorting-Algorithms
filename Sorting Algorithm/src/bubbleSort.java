import java.util.Scanner;

public class bubbleSort {

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
			for (int j = 0; j < array.length - i -1; j++) {
				if (array[j] >  array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.print("After Sorting : ");
		for (int i : array) {
			System.out.print(i + " ");
		}

	}

}
