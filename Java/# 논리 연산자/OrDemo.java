package org.opentutorials.javatutorials.conditionaloperator;

public class OrDemo {

	public static void main(String[] args) {
		if (true || true) {
			System.out.print(1);
		}
		if (true || false) {
			System.out.print(2);
		}
		if (false || true) {
			System.out.print(3);
		}
		if (false || false) {
			System.out.print(4);
		}
		
	}

}
