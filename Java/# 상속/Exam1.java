package org.opentutorials.javatutorials.Inheritance;



	class calculator {
		int L, R;

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
	
	class addsubstract extends calculator {
		public void substract () {
			System.out.println(this.L-this.R);
		}
	}
	class addmultplcation extends addsubstract {
		public void multplcation () {
			System.out.println(this.L*this.R);
		}
	}
	
	
	public  class Exam1{

		public static void main(String[] args) {
			addmultplcation c1 = new addmultplcation();
			c1.setoprands(10,40);
			c1.sum();
			c1.avg();
			c1.substract();
			c1.multplcation();
		}
	}


