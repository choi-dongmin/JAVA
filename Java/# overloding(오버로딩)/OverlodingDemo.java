package org.opentutorials.javatutorials.overloding;

public class OverlodingDemo {
	
	void a() {System.out.println("void a()");}
	void a(int arg1){System.out.println("void a(int args1)");}
	void a(String args1){System.out.println("void a(String arg1");}
	// int a(){ System.out.println(int a();)}

	public static void main(String[] args){
		OverlodingDemo OD = new OverlodingDemo();
		OD.a();
		OD.a(1);
		OD.a("Coding");
	}
}

class OverlodingDemo2 extends OverlodingDemo {
	
	void a (String arg1, String arg2){System.out.println("sub class : void a (	String arg1, String arg2)");}

	void a(){System.out.println("sub class : void a()");}

	public static void main(String[] args){
		OverlodingDemo2 OD = new OverlodingDemo2();
		OD.a();
		OD.a(1);
		OD.a("Coding");
		OD.a("Hi","Coding");
	}

}