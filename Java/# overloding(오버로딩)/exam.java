package org.opentutorials.javatutorials.overloding;

class calculator {
	int F,S,T;

	public void setOprands(int F, int S){
		this.F = F; this.S = S; 
	}
	public void setOprands(int F, int S, int T){
		this.setOprands(F, S);
		this.T = T;
	}

	public void sum(){
		System.out.println(this.F+this.S+this.T);
	}


	public void avg() {
		System.out.println((this.F+this.S+this.T)/2);
	}
}

public class exam {
	
	public static void main(String[] args){

		calculator c1 = new calculator();
		c1.setOprands(10,20);
		c1.sum();
		c1.avg();
		c1.setOprands(30,30,30);
		c1.sum();
		c1.avg();

	}
}