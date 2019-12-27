package org.opentutorials.javatutorials.polymorphism;
class A{
	public String X(){
		return "A.X";
	}
}
class B extends A{
	public String X(){
		return "B.X";
	}
	public String Y(){
		return "y";
	}
}
class B2 extends A{
	public String X(){
		return "B2.X";	
	}
}

public class PolymorphismDemo2{
	public static void main(String[] args){
	A obj = new B();
	A obj2 = new B2();
	System.out.println(obj.X());
	System.out.println(obj2.X());
	}
}