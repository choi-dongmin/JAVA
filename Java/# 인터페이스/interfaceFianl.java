package org.opentutorials.javatutorials.interfaces;

public interface CalculatorRule {
	public void setOprands(int F, int S, int T);
	public int sum();
	public int avg(); 
}

class Calculator implements CalculatorRule{
	int F,S,T;
	public void setOprands(int F, int S, int T){
		this.F=F; this.S=S; this.T=T;
	}

	public int sum(){
		return this.F+this.S+this.T;
	}
	public int avg(){
		return (this.F+this.S+this.T)/3;
	}

}

public class interfaceFianl{
	public static void main(String[] args){

	Calculator c1 = new Calculator();
	c1.setOprands(10,20,30);
	System.out.println(c1.sum() + c1.avg());
	}
}