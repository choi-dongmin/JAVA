package org.opentutorials.javatutorials.constructor;

class calculator{
	int L,R;

	public calculator (int L, int R) {
		this.L = L;
		this.R = R;
	}

	public void sum(){
		System.out.println(this.L+this.R);
	}
	public void avg(){
		System.out.println((this.L+this.R)/2);
	}
}
public class CalculatorDemo1{
	public static void main(String [] args){
		calculator c1 = new calculator(10,20);
			c1.sum();
 			c1.avg();
	}
}
