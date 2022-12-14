package io.exception.child_parent;

import java.io.IOException;

/**
 * 
 * @author praveenrao 
 * 		1. If the superclass method does not declare an exception:
 *         If the superclass method does not declare an exception, subclass
 *         overridden method can not declare the cheked exception, but it can
 *         declare unchecked exceptions. 
 *      2. If the superclass method does not
 *         declare an exception, subclass overridden method can not declare the
 *         checked exception but can declare unchecked exception.
 */
class Parent {
	void msg() {
		System.out.println("parent method");
	}
}

public class ExceptionChild extends Parent {
	void msg() throws IOException
		System.out.println("ExceptionChild");
	}

	public static void main(String[] args) {
		Parent p = new ExceptionChild();
		p.msg();
	}
}
