package org.opentutorials.javatutorials.exception3;
class DivideException extends Exception{
	DivideException(){
		super();
	}
	DivideException(String message){
		super(message);
	}
}
// 기본생성자 말고 다른 생성자를 말들어 주고 싶으면 직접 생성자를 만들어 주어야 한다.

class Calculator1 {
	int L, R;
	public void setOprands(int L, int R){
		this.L=L; this.R=R;
	}
	public void divide(){
		try{
			if(R==0){
				throw new DivideException ("0 으로는 나누기가 불가능 합니다.");
			}
				System.out.println(this.L/this.R);
		}catch(DivideException e){
			e.printStackTrace();
		}
	}	

}


public class UnchackedAndChackedDemo{
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


