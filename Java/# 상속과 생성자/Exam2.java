package org.opentutorials.javatutorials.InheritanceAndConstructor;


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

class addsubstract extends calculator2 {
	public void substract () {
		System.out.println(this.L-this.R);
	}
}
class addmultplcation extends addsubstract { 
	public addmultplcation(int L, int R) {  // 추가
		this.L=L; this.R=R;					// 추가
	}										// 추가 
	
	public void multplcation () {
		System.out.println(this.L*this.R);
	}
}


public  class Exam2{

	public static void main(String[] args) {
		addmultplcation c1 = new addmultplcation(20,10);  // 변경 
		c1.sum();										  // 삭제 setoperands
		c1.avg();
		c1.substract();
		c1.multplcation();
	}
}

