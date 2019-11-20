package org.opentutorials.javatutorials.object;

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
		
	public static class ClaculatorDemo3{
	
		public static void main(String[] args) {
				calculator c1 = new calculator();
				c1.setoprands(10,40);
				c1.sum();
				c1.avg();
				
				
				calculator c2 = new calculator();
				c2.setoprands(50,50);
				c2.sum();
				c2.avg();
		}
	}
	}
