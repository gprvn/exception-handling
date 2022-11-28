package io.exception.try_catch;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class JavaException09 {
	public static void main(String[] args) {
		PrintWriter pw;
		
		try {
			pw = new PrintWriter("somefile.txt"); //may throw exception
			pw.print("saved");
			//providing the cheked exception handler
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("File saved successfully");
	}
}
