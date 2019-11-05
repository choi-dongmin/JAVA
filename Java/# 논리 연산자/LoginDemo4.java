package org.opentutorials.javatutorials.conditionaloperator;

public class LoginDemo4 {

	public static void main(String[] args) {
		String id = args[0];
		String pw = args[1];
		if (id.equals("dongmin") && pw.equals("123456")) {	
			System.out.print("Correct");
		} else {
			System.out.print("Wrong");
		}
		//loginDemo2를 더 && 으로 효율적이게 변하였다.
		
	}
}
