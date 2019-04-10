package demo.java.methods;

public class MethodsDemo {

	public void doSomething() {
		System.out.println("Called method with no arguments");
	}
	
	public void doSomething(int number) {
		System.out.println("Called method with the following arguments: int");
	}
	
	public void doSomething(String text) {
		System.out.println("Called method with the following arguments: String");
	}
	
	public void doSomething(int number, String text) {
		System.out.println("Called method with the following arguments: int, String");
	}
	
	public void doSomething(String text, int number) {
		System.out.println("Called method with the following arguments: String, int");
	}
	
	public void doSomething(int number, String text, double percent) {
		System.out.println("Called method with the following arguments: int, String, double");
	}
	
}
