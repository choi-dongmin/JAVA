package org.opentutorials.javatutorials.finalexam;

class Calculator {
	static final double PI = 3.14;
	int L,R;

	public void setOprands (int L, int R){
		this.L =L; this.R=R;
		// calculator.PI =10; 오류 발생
	}

	public void sum(){
		System.out.println(this.L+this.R);
	}

	public void avg(){
		System.out.println((this.L+this.R)/2);
	}
}

public class FinalExam1{

	public static void main(String[] args){

		Calculator c1 = new Calculator();
		System.out.println(c1.PI);
		// Calculator.Pi = 10; 오류발생
	}
}

