package demo.java.helpermethods;

public class HelperMethods {

	public static void main(String[] args) {
		int[] array = new int[3];
		printArray(array);
		array[0] = 7;
		printArray(array);
		array[1] = 5;
		printArray(array);
		array[2] = 3;
		printArray(array);
	}

	private static void printArray(int[] array) {
		for (int number : array) {
			System.out.print(number + " ");
		}
		System.out.println();
	}

}
