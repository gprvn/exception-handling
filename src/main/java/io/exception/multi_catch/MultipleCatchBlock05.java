package io.exception.multi_catch;

public class MultipleCatchBlock05 {
	public static void main(String[] args) {
		try {
			int a[]= new int[5];
			a[5] = 30/0;
		} catch (Exception e) {
			System.out.println("Parent Exception Occured");
		} catch (ArithmeticException e) {
			System.out.println("Task1 is completed");
		}
	}
}
