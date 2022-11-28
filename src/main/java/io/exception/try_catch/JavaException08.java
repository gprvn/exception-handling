package io.exception.try_catch;

public class JavaException08 {
	public static void main(String[] args) {
		try {
			int[] arr = {1,2,3,4};
			System.out.println(arr[10]); //may throw exception
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}
}
