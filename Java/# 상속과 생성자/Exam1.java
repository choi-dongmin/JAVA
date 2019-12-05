package org.opentutorials.javatutorials.InheritanceAndConstructor;
	
	class calculator {
		int L, R;

		
		public void sum(){
			System.out.println(this.L+this.R);
		}
		public void avg(){
			System.out.println((this.L+this.R)/2);	
		}
	}
	
	class addsubstract extends calculator {
		public void substract () {
			System.out.println(this.L-this.R);
		}
	}
	class addmultplcation extends addsubstract {
		public addmultplcation(int L, int R) {   // 추가 
			this.L=L; this.R=R;					 // 추가
		}										 // 추가
		
		public void multplcation () {
			System.out.println(this.L*this.R);
		}
	}
	
	
	public  class Exam1{

		public static void main(String[] args) {
			addmultplcation c1 = new addmultplcation(20,20); // 변경
			c1.sum();										 // 삭제 setoprands
			c1.avg();
			c1.substract();
			c1.multplcation();
		}
	}

	

