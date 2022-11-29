package io.exception.finally_block;

public class FinallyBlock01 {
	public static void main(String[] args) {
		try {
			//this code does not throw any exception
			int data = 25/5;
			System.out.println(data);
			
			//catch won't be executed
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
			try {
				int data = 5/0;
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
			System.out.println("gracefully handled exception in finally");
		}
		System.out.println("rest of the code");
	}
}
