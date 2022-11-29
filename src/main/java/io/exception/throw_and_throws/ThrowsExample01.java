package io.exception.throw_and_throws;

public class ThrowsExample01 {
	public static int divideNum(int m, int n) throws ArithmeticException {
		int div = m / n;
		return div;
	}
	
	public static void main(String[] args) {
		try {
			ThrowsExample01.divideNum(45, 0);
		} catch (ArithmeticException e) {
			System.out.println("\nNumber can not be divided by 0");
		}
		System.out.println("Rest of the Code..");
	}
}
