package org.opentutorials.javatutorials.note;

public class Seng {
	
	public static int seng(int a) {
		if (a == 0) {
			return 1;
		} else {
			return 2*seng(a-1);
		}
	}
	public static void main(String[] args) {
		System.out.println(seng(7));
	}
}