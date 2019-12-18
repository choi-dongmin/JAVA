package org.opentutorials.javatutorials.interfaces;

class CalculatorDummy{
	
	public void setOprands(int F, int S, int T){}

	public int sum(){
		return 20;
	}
	public int avg(){
		return 60;
	}

}

public class InterfaceDemo{
	public static void main(String[] args){

	CalculatorDummy c1 = new CalculatorDummy();
	c1.setOprands(10,20,30);
	System.out.println(c1.sum() + c1.avg());
	}
}
