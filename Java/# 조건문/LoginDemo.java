package org.opentutorials.javatutorials.Condition;

public class LoginDemo {

	public static void main(String[] args) {
		String id = args[0];
		if (id.equals("dongmin")){
			System.out.print("Correct");
		} else {
			System.out.print("Wrong");
		}
	}
}
