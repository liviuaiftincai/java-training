package demo.java.conditionals;

public class ConditionalsDemo {

	public static void main(String[] args) {
		checkConditional();
	}

	private static void checkConditional() {
		int a = 5;
		int b = 10;
		
		if ((a>b) && getBoolean()) {
			System.out.println("The condition was TRUE");
		} else {
			System.out.println("The condition was FALSE");
		}
		
	}

	private static boolean getBoolean() {
		System.out.println("Get boolean method was called");
		return true;
	}
	
	
	
}
