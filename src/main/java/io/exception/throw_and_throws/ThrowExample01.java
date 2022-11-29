package io.exception.throw_and_throws;

public class ThrowExample01 {

	public static void checkNum(int num) {
		if (num < 1)
			throw new ArithmeticException("\nNumber is negative, can not calculate square");
		else
			System.out.println("Square of " + num + " is " + (num * num));
	}

	public static void main(String[] args) {
//		ThrowExample example = new ThrowExample();
		ThrowExample01.checkNum(-3);
		System.out.println("rest of the code");
	}
}
