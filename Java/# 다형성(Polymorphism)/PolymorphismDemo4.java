package org.opentutorials.javatutorials.polymorphism;
interface I2{
	public String A();
}
interface I3 {
	public String B();
}

class D implements I2, I3 {
	public String A(){
		return "A";
	}
	public String B(){
		return "B";
	}
}
public class PolymorphismDemo4{
	public static void main(String[] args){
		D obj = new D();
		I2 objI2 = new D();
		I3 objI3 = new D();

		obj.A();
		obj.B();

		objI2.A();
		//objI2.B(); 오류 발생

		//objI3.A(); 오류 발생
		objI3.B();
	}
}
