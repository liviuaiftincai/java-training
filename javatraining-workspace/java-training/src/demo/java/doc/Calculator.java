package demo.java.doc;

/**
* The it a class for a simple calculator which makes basic operations.
* 
* Be aware that multiply and divide operations are not performed first.
* 
* Ex.: 2 + 4 * 3 = 18
* 
* For this example use the calculator like that:
* calculator.init(4);
* calculator.multiply(3);
* calculator.add(2);
* 
* and calculator.getResult() should return the correct result of 14;
*/
public class Calculator {

	private double result;

	/**
	* This is the init method which set the first number to the input number.
	* 
	* @param inputNumber The input number.
	*/
	public void init(double inputNumber) {
		result = inputNumber;
	}

	/**
	* This method resets the result to 0.
	*/
	public void reset() {
		result = 0;
	}

	/**
	* This method adds the input number to the result.
	* 
	* @param inputNumber The input number.
	*/
	public void add(double inputNumber) {
		result += inputNumber;
	}

	/**
	* This method substract the input number from the result.
	* 
	* @param inputNumber The input number.
	*/
	public void substract(double inputNumber) {
		result -= inputNumber;
	}

	/**
	* This method multiply the input number to the result.
	* 
	* @param inputNumber The input number.
	*/
	public void multiply(double inputNumber) {
		result *= inputNumber;
	}

	/**
	* This method divides the input number to the result.
	* 
	* @param inputNumber The input number.
	*/
	public void divide(double inputNumber) {
		result /= inputNumber;
	}

	/**
	* This method provides the result.
	* 
	* @return The result.
	*/
	public double getResult() {
		return result;
	}

	/**
	* This method prints the result.
	*/
	public void printResult() {
		System.out.println(result);
	}
	
}
