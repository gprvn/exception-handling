package io.exception.throw_keyword;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * throwing checked exception
 * @author praveenrao Note: Every subclass of Error and RuntimeException is an
 *         unchecked exception in Java. A checked exception is everything else
 *         under the Throwable class.
 */
public class Throw02 {
	// function to check if a person is eligible to vote or not and throwing checked
	// exception
	public static void method() throws FileNotFoundException {
		FileReader file = new FileReader("/Users/praveenrao/Documents/dev/big-o/BinarySearchImpl.java");
		BufferedReader fileInput = new BufferedReader(file);

		throw new FileNotFoundException();
	}

	public static void main(String[] args) {
		try {
			method();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Rest of the Code");
	}
}
