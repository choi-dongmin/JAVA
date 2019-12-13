package org.opentutorials.javatutorials.abstractclass;


abstract class A {
	
	public abstract int b();
	
	public void c() {
		System.out.println("Succees");
	}
}

class B extends A {
	public int b() {
		return 1;
	}
}

public class AbstractDemo {
	
	public static void main(String[] args) {
		B obj = new B();

		
		
	}

}
