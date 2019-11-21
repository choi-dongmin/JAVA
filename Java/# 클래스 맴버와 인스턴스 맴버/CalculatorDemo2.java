package org.opentutorials.javatutorials.classinstance;

class Calculator2 {
	
	static double pi = 3.14;
	int L,R;
	static int base = 0;
	
	public void setoprands (int L, int R){
		this.L = L;
		this.R = R;
	}

	public void sum(){
		System.out.println(this.L+this.R + base);
	}

	public void avg(){
		System.out.println((this.L+this.R)/2);
	}
}

public class CalculatorDemo2 {
	
	public static void main(String[] args){
		Calculator.base =10;
		
		Calculator c1 = new Calculator();
		c1.setoprands(10,20);
		c1.sum();

		Calculator c2 = new Calculator();
		c2.setoprands(20,40);
		c2.sum();

	
	}
}