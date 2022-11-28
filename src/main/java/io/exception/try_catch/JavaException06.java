package io.exception.try_catch;

public class JavaException06 {
	public static void main(String[] args) {
		try {
			int data1 = 50/0; //may throw exception
		} catch(ArithmeticException e) {
			//generating exception in catch block
			int data1 = 50/0;
		}
		System.out.println("rest of the code.");
	}
}
