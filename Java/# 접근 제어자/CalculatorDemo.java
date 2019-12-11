package org.opentutorials.javatutorials.accessmodifier;

class Calculator {
	private int L,R;

	public void setOprands (int L, int R){
		this.L = L; this.R = R;
	}

	private int sum(){
		return this.L+this.R;
	}

	public void sumDecoPlus(){
		System.out.println("+++"+sum()+"+++");
	}

	public void sumDecoMinus(){
		System.out.println("---"+sum()+"---");
	}
}

public class CalculatorDemo {
	public static void main(String[] args){
		Calculator c1 = new Calculator();
		c1.setOprands(10,20);
		c1.sumDecoPlus();
		c1.sumDecoMinus();

	}
}
