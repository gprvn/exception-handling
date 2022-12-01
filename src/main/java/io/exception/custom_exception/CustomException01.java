package io.exception.custom_exception;

class InvalidAgeException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public InvalidAgeException(String str) {
		super(str);
	}

}

public class CustomException01 {
	static void validate(int age) throws InvalidAgeException {
		if(age <18)
			throw new InvalidAgeException("age is not valid to vote");
		else
			System.out.println("welcome to vote");
	}
	public static void main(String[] args) {
		try {
			validate(13);
		} catch (InvalidAgeException e) {
			System.out.println("caught the exception:");
			System.out.println("Exception Occured: "+e);
		}
		System.out.println("rest of the code");
	}
}
