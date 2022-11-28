package io.exception.try_catch;

//defining custom message
public class JavaException04 {
	public static void main(String[] args) {
		try {
			int data = 50/0;
		} catch(ArithmeticException e) {
			System.out.println("can't divide by zero");
		}
	}
}
