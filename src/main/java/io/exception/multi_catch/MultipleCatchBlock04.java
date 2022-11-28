package io.exception.multi_catch;

public class MultipleCatchBlock04 {
	public static void main(String[] args) {
		try {
			String name = null;
			System.out.println(name.length());
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception Occured");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception Occured");
		} catch (Exception e) {
			System.out.println("Parent Exception Occured");
		}
		System.out.println("Rest of the code");
	}
}
