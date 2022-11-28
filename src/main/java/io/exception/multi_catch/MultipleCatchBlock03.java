package io.exception.multi_catch;

public class MultipleCatchBlock03 {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5] = 30/0;
			System.out.println(a[10]);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occured");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occured");
		}catch (Exception e) {
			System.out.println("Parent Exception occured");
		}
		System.out.println("rest of the code");
	}
}
