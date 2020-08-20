package org.opentutorials.javatutorials.multiloop;

public class TimesTable {

	public static void main(String[] args) {
		
		System.out.print("  | ");
		for(int i=1; i<10; i++) {
			System.out.print(+ i+" ");
		}
		System.out.println();
		System.out.println("- + - - - - - - - - -");

		for(int i = 1; i < 10; i++) {
			System.out.print(i+" | ");
			for(int o = 1; o<10; o++) {
				System.out.print(i*o+" ");
			}
			System.out.println();
		}

	}

}
