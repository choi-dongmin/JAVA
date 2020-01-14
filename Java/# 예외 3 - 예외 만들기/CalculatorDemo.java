package org.opentutorials.javatutorials.exception3;

class Calculator {
	int L, R;
	public void setOprands(int L, int R){
		this.L=L; this.R=R;
	}
	public void divide(){
		if(R==0){
			throw new ArithmeticException("0 으로는 나누기가 불가능 합니다.");
		}
		try{
			System.out.println("계산 결과는 ");
			System.out.println(this.L/this.R);
			System.out.println("입니다.");
			}
		catch(Exception e){
			System.out.println("\n\ne.getmessage()\n"+e.getMessage());
			System.out.println("\n\ne.toString()\n"+e.toString());
			System.out.println("\n\ne.printStackTrace()");
			e.printStackTrace();
		}	
	}
}


public class CalculatorDemo{
	public static void main(String[] args){
		Calculator c1 = new Calculator();
		c1.setOprands(10,0);
		try{
			c1.divide();
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		  }
	}
}