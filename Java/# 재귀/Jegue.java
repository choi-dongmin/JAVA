package org.opentutorials.javatutorials.note;

public class Jegue {

	public static int factorials (int i) {
		if (i == 1) {
			return 1;
		} else {
			return i*factorials(i-1);
		}
	}
	public static void main(String[] args) {
		System.out.println(factorials(5));
	}
}
