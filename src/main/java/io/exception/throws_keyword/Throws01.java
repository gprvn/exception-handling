package io.exception.throws_keyword;

import java.io.IOException;

/**
 * 
 * @author praveenrao note: if we are calling a method that declares an
 *         exception, we must either caught or declare the exception
 */
public class Throws01 {

	void m() throws IOException {
		throw new IOException("device error");
	}

	void n() throws IOException {
		m();
	}

	void p() {
		try {
			n();
		} catch (IOException e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String[] args) {
		Throws01 th = new Throws01();
		th.p();
		System.out.println("normal flow..");
	}

}
