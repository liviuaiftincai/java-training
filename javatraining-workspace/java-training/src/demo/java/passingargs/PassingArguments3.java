package demo.java.passingargs;

public class PassingArguments3 {

	public static void main(String[] args) {
		Integer number = 5;
		number = 6;
		changeNumber(number);
		System.out.println(number);
	}

	private static void changeNumber(Integer number) {
		number = 10;
	}

}
