package io.exception.throws_keyword;

import java.io.IOException;

/**
 * 
 * @author praveenrao
 *	if exception does occur
 */
class B {
	void method() throws IOException{
		throw new IOException("device error");
	}
}
public class Throws04 {
	public static void main(String[] args) throws IOException {
		B b = new B();
		b.method();
		System.out.println("normal flow..");
	}
}
