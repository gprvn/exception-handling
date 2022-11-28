package io.exception.multi_catch;

public class MultipleCatchBlock01 {
	
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5] = 30/0;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception occures");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occures");
		} catch(Exception e) {
			System.out.println("exception occures");
		}
		System.out.println("rest of the code");
	}

}
