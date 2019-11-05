package org.opentutorials.javatutorials.Condition;

public class LoginDemo2 {

	public static void main(String[] args) {
		String id = args[0];
		String pw = args[1];
		if (id.equals("dongmin")) {
			if(pw.equals("123456")) {
				System.out.print("Correct");
		}   else {
				System.out.print("Wrong");
		}
		
		} else {
			System.out.println("wrong");
		}
	}
}
