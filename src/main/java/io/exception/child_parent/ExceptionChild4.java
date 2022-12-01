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
class Parent03 {
	void msg() throws Exception{
		System.out.println("parent method");
	}
}

public class ExceptionChild4 extends Parent04 {
	void msg() throws Exception { // throwing same exception
		System.out.println("Child Method");
	}

	public static void main(String[] args) {
		Parent04 p = new ExceptionChild4();
		try {
			p.msg();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
