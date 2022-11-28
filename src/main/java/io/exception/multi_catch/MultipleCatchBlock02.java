package io.exception.multi_catch;

public class MultipleCatchBlock02 {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			int test = 10/0;
			System.out.println(test);
			System.out.println(a[10]);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception Occures");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occures");
		} catch(Exception e) {
			System.out.println("Parent Exception occures");
		}
		System.out.println("Rest of the Code");
	}
}
