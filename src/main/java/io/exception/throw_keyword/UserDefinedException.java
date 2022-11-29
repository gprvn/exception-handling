package io.exception.throw_keyword;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * throwing User-defined exception
 * 
 * @author praveenrao Note: Every subclass of Error and RuntimeException is an
 *         unchecked exception in Java. A checked exception is everything else
 *         under the Throwable class.
 * 
 *         Exception is everything else under the Throwable class
 */
public class UserDefinedException extends Exception {

	public UserDefinedException(String str) {
		//Calling constructor of parent exception
		super(str);
	}
}
