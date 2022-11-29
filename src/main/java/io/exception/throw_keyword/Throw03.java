package io.exception.throw_keyword;

public class Throw03 {
	public static void main(String[] args) {
		try {
			throw new UserDefinedException("this is the user-defined exception");
		} catch (UserDefinedException e) {
			System.out.println("Caught the exception");
			System.out.println(e.getMessage());
		}
	}
}
