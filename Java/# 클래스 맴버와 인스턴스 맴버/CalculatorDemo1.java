package org.opentutorials.javatutorials.classinstance;


class claculator {
	static double pi = 3.14;
	int L,R;

	public void setoprands (int L, int R){
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

public class CalculatorDemo1 {
	
	public static void main(String[] args){

		calculator c1 = new calculator();
		System.out.println(c1.pi);


		calculator c2 = new calculator();
		System.out.println(c2.pi);


		System.out.println(calculator.pi);
	}
}