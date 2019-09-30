import java.util.Scanner;

public class MargeSort {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Array Length: ");
		int arraylength = scanner.nextInt();

		System.out.println("Array Elements: ");
		int array[] = new int[arraylength];

		for (int i = 0; i < arraylength; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.println("Before Sorting : ");
		printArray(array);

		array = dividArray(array);
		System.out.println("After Sorting : ");
		printArray(array);

		scanner.close();

	}// end main method

	private static int[] dividArray(int[] array) {

		int mid = array.length / 2;

		if (array.length <= 1) {
			return array;
		}

		int leftArray[] = new int[mid];
		int[] rightArray;

		if (array.length % 2 == 0) {
			rightArray = new int[mid];
		} else {
			rightArray = new int[mid + 1];
		}

		for (int i = 0; i < mid; i++) {
			leftArray[i] = array[i];
		}

		for (int i = 0; i < rightArray.length; i++) {
			rightArray[i] = array[mid + i];
		}

		int[] result = new int[array.length];

		leftArray = dividArray(leftArray);
		rightArray = dividArray(rightArray);

		result = margeArray(leftArray, rightArray);

		return result;
	}// end method

	private static int[] margeArray(int[] leftArray, int[] rightArray) {

		int[] finalArray = new int[leftArray.length + rightArray.length];

		int leftPointer = 0, rightPointer = 0, resultPointer = 0;

		while (leftPointer < leftArray.length || rightPointer < rightArray.length) {

			if (leftPointer < leftArray.length && rightPointer < rightArray.length) {

				if (leftArray[leftPointer] < rightArray[rightPointer]) {
					finalArray[resultPointer++] = leftArray[leftPointer++];
				} else {
					finalArray[resultPointer++] = rightArray[rightPointer++];
				} // end inner if here

			} // end if here
			else if (leftPointer < leftArray.length) {
				finalArray[resultPointer++] = leftArray[leftPointer++];
			}

			else {
				finalArray[resultPointer++] = rightArray[rightPointer++];
			}
		} // end while loop
		return finalArray;
	}

	private static void printArray(int[] array) {

		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}// end print method
}
