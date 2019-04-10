package demo.java.passingargs;

public class PassingArguments {

	public static void main(String[] args) {
		int number = 5;
		changeNumber(number);
		System.out.println(number);
	}

	private static int changeNumber(int number) {
		number = 10;
		return number;
	}
	
}
