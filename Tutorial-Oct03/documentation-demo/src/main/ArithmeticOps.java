package main;

/**
 * 
 * @author MasudRahman This class provides a list of arithmetic operation
 */

public class ArithmeticOps {

	/**
	 * This function adds two numbers
	 */
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	/**
	 * This function subtracts the second from the first number
	 */
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}

	/**
	 * This function multiplies two numbers
	 */
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	/**
	 * This function divides first number by the second one
	 */
	public int divide(int num1, int num2) {
		if (num2 != 0) {
			return num1 / num2;
		} else {
			// do nothing
		}
		return num1;
	}

	// /This is a poor implementation of division
	public int dividePoor(int num1, int num2) {
		return num1 / num2;
	}

	// /This function makes a temporary delay
	public void makeDelay() {
		// make intentional delay
		try {
			Thread.sleep(101);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
