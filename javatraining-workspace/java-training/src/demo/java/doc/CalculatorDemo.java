package demo.java.doc;

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		// (2 + 4) * 5 - 3 
		calculator.init(2);
		calculator.add(4);
		calculator.multiply(5);
		calculator.substract(3);
		calculator.printResult();
	}
	
}
