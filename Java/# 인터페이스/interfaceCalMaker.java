package org.opentutorials.javatutorials.interfaces;

class CalculatorMaker implements CalculatorRule{
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
public class interfaceCalMaker {

}
