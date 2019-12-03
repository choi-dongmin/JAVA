package org.opentutorials.javatutorials.overriding;

class calculator2 {
	int L, R;
	
	public calculator2() {}
	
	public calculator2(int L, int R) {
		this.L=L; this.R=R;
	}

	public void setoprands(int L, int R){
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

class addsubstract extends calculator2 {     //1번
	public void substract () {
		System.out.println(this.L-this.R);
	}

	public void sum(){
		System.out.println("결과 값은" + (this.L + this.R) + "입니다");
	}
}


public  class Exam{

	public static void main(String[] args) {
		addsubstract c1 = new addsubstract(); 
		c1.setoprands(10,20);  
		c1.sum();										  
		c1.avg();
		c1.substract();
	}
}
