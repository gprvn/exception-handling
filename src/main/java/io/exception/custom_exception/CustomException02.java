package io.exception.custom_exception;

class MyCustomException extends Exception{

}

public class CustomException02 {
	public static void main(String[] args) {
		try {
			throw new MyCustomException();
		} catch (MyCustomException e) {
			System.out.println("Caught the exception");
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}
}
