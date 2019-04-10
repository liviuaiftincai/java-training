package demo.java.passingargs;

public class PassingArguments2 {

	public static void main(String[] args) {
		MyNumber myNumber = new MyNumber(5);
		changeNumber(myNumber);
		System.out.println(myNumber.number);
	}

	private static void changeNumber(MyNumber myNumber) {
//		myNumber.number = 10;
		myNumber = new MyNumber(10);
	}
	
}
