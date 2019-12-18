package org.opentutorials.javatutorials.interfaces;

public interface CalculatorRule{
	public void setOprands(int F, int S, int T);
	public int sum();
	public int avg(); 
}
class CalculatorDummy1 implements CalculatorRule{
	
	public void setOprands(int F, int S, int T){}

	public int sum(){
		return 20;
	}
	public int avg(){
		return 60;
	}

}

public class interfaceConsumer{
	public static void main(String[] args){

	CalculatorDummy1 c1 = new CalculatorDummy1();
	c1.setOprands(10,20,30);
	System.out.println(c1.sum() + c1.avg());
	}
}