package io.exception.throws_keyword;

import java.io.IOException;

/**
 * 
 * @author praveenrao case1: We have caught the exception i.e. we have handled
 *         the exception using try/catch block.
 */

class M {
	void method() throws IOException{
		throw new IOException("device error");
	}
}
public class Throws02 {
	public static void main(String[] args) {
		try {
			M m = new M();
			m.method();
		} catch(Exception e) {
			System.out.println("exception handled");
		}
		System.out.println("normal flow...");
	}
}
