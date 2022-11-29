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
public class NestedTryBlock02 {
	public static void main(String[] args) {
		// outer try block
		try {
			// inner try block-1
			try {
				//inner try block-2
				try {
					int arr[] = {1,2,3,4};
					
					//printing the array element out of the bounds
					System.out.println(arr[10]);
				} catch (ArithmeticException e) {
					System.out.println("Arithmetic exception");
					System.out.println("inner try block 2");
				}
			} catch (ArithmeticException e) {
				System.out.println("Arithmetic exception");
				System.out.println("inner try block 1");
			}

			System.out.println("other statements from inner try block");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("outer main try block");
		} catch (Exception e) {
			System.out.println("exception");
			System.out.println("exception handling from outer catch");
		}
		System.out.println("rest of the executable code");
	}
}
