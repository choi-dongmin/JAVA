package org.opentutorials.javatutorials.scope;

public class ScopeDemo3 {
	 static int i = 5;
	
	static void a () {
		int i = 1;
		b();
	}
	
	static void b () {
		int i = 100;
		System.out.println(i);
	}

	public static void main(String[] args) {
		int i =2;
		a();

	}

}
