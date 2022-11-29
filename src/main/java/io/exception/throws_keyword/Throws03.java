package io.exception.throws_keyword;

import java.io.IOException;

/**
 * 
 * @author praveenrao
 *	if exception does not occur
 */
class A {
	void method() throws IOException{
		System.out.println("device operation performed");
	}
}
public class Throws03 {
	public static void main(String[] args) throws IOException {
		A a = new A();
		a.method();
		System.out.println("normal flow..");
	}
}
