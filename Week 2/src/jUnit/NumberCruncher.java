/**
 * 
 */
package jUnit;

/**
 * @author Adam
 *
 */
public class NumberCruncher {

	public int addNumbers(int num1, int num2) {
		return num1 + num2;
	}

	public int addNumbers(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	public int divideNumbers(int num1, int num2) throws Exception {
		if (num2 == 0) {
			throw new Exception();
		} else {
			return num1 / num2;
		}
	}

}
