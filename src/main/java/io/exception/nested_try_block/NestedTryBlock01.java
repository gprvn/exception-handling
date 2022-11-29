package io.exception.nested_try_block;

/**
 * 
 * @author praveenrao 
 * 		   When any try block does not have a catch block for a
 *         particular exception, then the catch block of the outer (parent) try
 *         block are checked for that exception, and if it matches, the catch
 *         block of outer try block is executed.
 * 
 *         If none of the catch block specified in the code is unable to handle
 *         the exception, then the Java runtime system will handle the
 *         exception. Then it displays the system generated message for that
 *         exception.
 * 
 * 
 */
public class NestedTryBlock01 {
	public static void main(String[] args) {
		// outer try block
		try {
			// inner try block
			try {
				System.out.println("going to divide by 0");
				int b = 50 / 0;
			} catch (ArithmeticException e) {
				System.out.println(e);
			}

			// inner try block 2
			try {
				int a[] = new int[5];
				a[5] = 10;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			System.out.println("other statements from inner try block");
		} catch (Exception e) {
			System.out.println("exception handling from outer catch");
		}
		System.out.println("rest of the executable code");
	}
}
