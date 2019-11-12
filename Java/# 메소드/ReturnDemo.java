package org.opentutorials.javatutorials.method;

public class ReturnDemo {

	public static String num(int a) {
		if (a == 0) {
			return "0";
		} else if (a == 1) {
			return "1";
		} else if (a == 2) {
			return "2";
		}
		return "none";
	}
	
	public static void main(String[] args) {
		System.out.println(num(1));
	}

}
