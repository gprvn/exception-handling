package io.exception.child_parent;

/**
 * 
 *  @author praveenrao 
 * 		1. If the superclass method does not declare an exception:
 *         If the superclass method does not declare an exception, subclass
 *         overridden method can not declare the cheked exception, but it can
 *         declare unchecked exceptions. 
 *      2. If the superclass method does not
 *         declare an exception, subclass overridden method can not declare the
 *         checked exception but can declare unchecked exception.
 */
class Parent01 {
	void msg() {
		System.out.println("parent method");
	}
}

public class ExceptionChild2 extends Parent02 {
	void msg() throws ArithmeticException { // thorwing an unchecked exception
		System.out.println("Child Method");
	}

	public static void main(String[] args) {
		Parent02 p = new ExceptionChild2();
		p.msg();
	}
}
