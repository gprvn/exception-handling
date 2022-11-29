package io.exception.exception_propagation;

public class ExceptionPropagation01 {
	void m() {
		int data = 10/0;
	}
	
	void n() {
		m();
	}
	
	void p() {
		try {
			n();
		} catch(Exception e) {
			System.out.println("Exception Handled");
		}
	}
	public static void main(String[] args) {
		ExceptionPropagation01 obj = new ExceptionPropagation01();
		obj.p();
		System.out.println("normal flow");
	}
}
