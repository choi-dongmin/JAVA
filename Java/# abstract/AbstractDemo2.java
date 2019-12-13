package org.opentutorials.javatutorials.abstractclass;

abstract class Calculator {
	int L,R;
	
	public void SetOprands(int L, int R) {
		this.L = L; this.R = R;
	}
	
	int Sum() {
		return this.L+this.R;
	}
	
	int Avg() {
		return (this.L+this.R)/2;
	}
	
	abstract void sum();
	abstract void avg();
	public void Run(){
		sum();
		avg();
	}
}

class PlusCalculator extends Calculator {

	public void sum() {
		System.out.println("+ sum " + Sum());
	}
	public void  avg() {
		System.out.println("+ avg "+Avg());
	}
}

class MinusCalculator extends Calculator{

	public void sum() {
		System.out.println("- sum " + Sum());
	}
	public void  avg() {
		System.out.println("- avg "+Avg());
	}
}



public class AbstractDemo2 {
	
	public static void main(String[] args) {
		PlusCalculator plus = new PlusCalculator();
		plus.SetOprands(10, 20);
		plus.Run();
		
		
		MinusCalculator minus = new MinusCalculator();
		minus.SetOprands(10,10);
		minus.Run();
	}
}


