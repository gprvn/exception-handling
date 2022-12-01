package io.exception.child_parent;

import java.io.IOException;

/**
 * 
 * @author praveenrao If the superclass method does not declare an exception: If
 *         the superclass method does not declare an exception, subclass
 *         overridden method can not declare the cheked exception, but it can
 *         declare unchecked exceptions.
 */
class Parent {
	void msg() {
		System.out.println("parent method");
	}
}

public class ExceptionChild extends Parent {
	void msg() throws IOException {
		System.out.println("ExceptionChild");
	}

	public static void main(String[] args) {
		Parent p = new ExceptionChild();
		p.msg();
	}
}
