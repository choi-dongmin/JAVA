package org.opentutorials.javatutorials.InheritanceAndConstructor;

	class calculator3 {
		int L, R;
		
		public calculator3 (int L, int R) {  //
			this.L = L; this.R = R;
		}
		
		public void sum() {
			System.out.println(this.L + this.R);
		}
		public void avg () {
			System.out.println((this.L + this.R)/2);	
		}
	}
		class plussubstract extends calculator3 {
			public plussubstract (int L, int R) {
				super (L,R);
			}
			
			public void substract () {
				System.out.println(this.L-this.R);
			}
		}
		class plusX extends plussubstract { //
			public plusX (int L, int R) {
				super (L,R);
			}	
			public void x() {
				System.out.println(this.L*this.R);
			}
		}
	
 



public class Exam3 {
	
	public static void main(String [] args) {
	
	plusX c1 = new plusX(10,10);
	c1.sum();
	c1.avg();
	c1.substract();
	c1.x();
	}
}