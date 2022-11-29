package io.exception.throw_and_throws;

public class ThrowAndThrowsExample {
	static void method() throws ArithmeticException{
		System.out.println("Inside the method()");
		throw new ArithmeticException("Throwing Arithmatic Exception");
	}
	public static void main(String[] args) {
		try {
			method();
		} catch (ArithmeticException e) {
			System.out.println("caught in main method");
		}
	}
}
