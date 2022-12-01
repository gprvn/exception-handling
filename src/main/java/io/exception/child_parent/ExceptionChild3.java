package io.exception.child_parent;

/**
 * 
 * @author praveenrao 
 * 1. If the superclass method does not declare an exception:
 *         If the superclass method does not declare an exception, subclass
 *         overridden method can not declare the cheked exception, but it can
 *         declare unchecked exceptions. 
 * 2. If the superclass method does not
 *         declare an exception, subclass overridden method can not declare the
 *         checked exception but can declare unchecked exception. 
 * 3. If the
 *         superclass method declares an exception, subclass overridden method
 *         can declare the same subclass exception or no exception but can not
 *         declare parent exception.
 */
class Parent02 {
	void msg() throws ArithmeticException{
		System.out.println("parent method");
	}
}

public class ExceptionChild3 extends Parent02 {
	void msg() throws Exception { // throwing parent exception
		System.out.println("Child Method");
	}

	public static void main(String[] args) {
		Parent02 p = new ExceptionChild3();
		p.msg();
	}
}
