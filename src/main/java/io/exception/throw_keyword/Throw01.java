package io.exception.throw_keyword;

/**
 * 
 * @author praveenrao
 *
 *         Note: If we throw unchecked exception from a method, it is must to
 *         handle the exception or declare in throws clause.
 */
public class Throw01 {
	// function to check if person is eligible to vote or not
	public static void validate(int age) {
		if (age < 18) {
			// throw unchecked Arithmatic exception if not eligible to vote
			throw new ArithmeticException("Person is not eligible to vote.");
		} else {
			System.out.println("Person is eligible to vote.");
		}
	}

	public static void main(String[] args) {
		try {
			validate(13);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}
}
