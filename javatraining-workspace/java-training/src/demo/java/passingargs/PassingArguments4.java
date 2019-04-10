package demo.java.passingargs;

public class PassingArguments4 {

	public static void main(String[] args) {
		int[] numbersArray = {1,3,5};
		changeArray(numbersArray);
		printArray(numbersArray);
	}

	private static void changeArray(int[] numbersArray) {
//		numbersArray[0] = 2;
//		numbersArray[1] = 4;
//		numbersArray[2] = 6;
		
		numbersArray = new int[3];
		numbersArray[0] = 2;
		numbersArray[1] = 4;
		numbersArray[2] = 6;
	}
	
	private static void printArray(int[] numbersArray) {
		for (int number: numbersArray) {
			System.out.println(number);
		}
	}
	
}
