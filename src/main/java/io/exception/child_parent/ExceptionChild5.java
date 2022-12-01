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
class Parent04 {
	void msg() throws Exception{
		System.out.println("parent method");
	}
}

public class ExceptionChild5 extends Parent03 {
	void msg() { // throwing no exception as parent class
		System.out.println("Child Method");
	}

	public static void main(String[] args) {
		Parent03 p = new ExceptionChild5();
		try {
			p.msg();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
